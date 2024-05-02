package com.pt.taco.jira.zephyr;

import com.google.gson.reflect.TypeToken;
import com.pt.taco.jira.zephyr.client.TestCasesApi;
import com.pt.taco.jira.zephyr.client.TestResultApi;
import com.pt.taco.jira.zephyr.client.model.Attachment;
import com.pt.taco.jira.zephyr.client.model.Step;
import com.pt.taco.jira.zephyr.client.model.TestCase;
import com.pt.taco.jira.zephyr.client.model.TestResult;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.apache.http.HttpException;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.apache.http.HttpStatus.SC_UNAUTHORIZED;

public class ZephyrRestClient {

    protected static final Logger LOG = Logger.getLogger(ZephyrRestClient.class.getName());

    private final  String baseUrlString;
    private final String username;
    private final String apiToken;

    public ZephyrRestClient() {
        this(System.getenv("JIRA_URL"), System.getenv("JIRA_USERNAME"), System.getenv("JIRA_API_TOKEN"));
    }

    public ZephyrRestClient(final String baseUrlString, final String username, final String apiToken) {
        this.baseUrlString = baseUrlString;
        this.username = username;
        this.apiToken = apiToken;
    }


    private RequestSpecBuilder getRequestSpecification() {
        return new RequestSpecBuilder()
                .setAuth(RestAssured.preemptive().basic(this.username, this.apiToken))
                .setBaseUri(this.baseUrlString + "/rest/atm/1.0");
    }

    private String getEnvVariable(final String varName) {
        String varValue = System.getenv(varName);
        if (varValue == null) {
            throw new MissingEnvVariableException(varName + " is not set");
        }
        return varValue;
    }

    private ApiClient getClient() {
        return ApiClient.api(ApiClient.Config.apiConfig()
                .reqSpecSupplier(this::getRequestSpecification));
    }

    /*
     * Test Case API
     */
    public TestCasesApi getTestCasesClient() {
        return getClient().testCases();
    }

    public TestCase getTestCase(final String testCaseKey) throws HttpException {
        TestCase testCase;
        Response response = getTestCasesClient().getTestCaseByTestCaseKey().testCaseKeyPath(testCaseKey)
                .execute(ResponseBody::peek).peek();
        testCase = validateGetTestCaseResponse(testCaseKey, response);
        return testCase;
    }

    public TestCase validateGetTestCaseResponse(final String testCaseKey, final Response response) throws HttpException {
        TestCase testCase;
        if (response.getStatusCode() == SC_OK) {
            testCase = response.as(TestCase.class);
        } else {
            throw new HttpException("The Test Case (" + testCaseKey + ") was not found.");
        }
        return testCase;
    }

    public void updateTestCase(final String testCaseKey, final TestCase testCase) throws HttpException {
        Response response = getTestCasesClient().updateTestCaseByTestCaseKey().testCaseKeyPath(testCaseKey)
                .body(testCase)
                .execute(ResponseBody::peek);
        int statusCode = response.getStatusCode();
        if (statusCode == SC_BAD_REQUEST) {
            throw new HttpException("Some parameters are invalid or not found.");
        } else if (statusCode == SC_UNAUTHORIZED) {
            throw new HttpException("Authentication error.");
        } else {
            if (LOG.isLoggable(Level.INFO)) {
                LOG.info(String.format("Test Case (%s) was successfully updated.", testCaseKey));
            }
        }
    }

    public TestCase getDetailedTestCase(final String testCaseKey) throws HttpException {
        TestCase testCase = getTestCase(testCaseKey);
        List<Step> testScriptSteps = testCase.getTestScript().getSteps();
        if (testScriptSteps == null) {
            testScriptSteps = new ArrayList<>();
        }
        for (Step step : testScriptSteps) {
            if (step.getTestCaseKey() != null) {
                TestCase stepTestCase = getTestCase(step.getTestCaseKey());
                step.setTestCase(stepTestCase);
            }
        }
        return testCase;
    }

    public List<Attachment> getTestCaseAttachments(final String testCaseKey) {
        Response response = getTestCasesClient().getTestCaseAttachments().testCaseKeyPath(testCaseKey)
                .execute(ResponseBody::peek).peek();
        if (response.getStatusCode() == SC_OK) {
            Type type = new TypeToken<List<Attachment>>() {
            }.getType();
            return response.as(type);
        }
        return new ArrayList<>();
    }

    public TestCase getTestCaseWithAttachments(final String testCaseKey) throws HttpException {
        TestCase testCase = getTestCase(testCaseKey);
        List<Attachment> attachmentList = getTestCaseAttachments(testCaseKey);
        testCase.setAttachmentList(attachmentList);
        return testCase;
    }

    public TestResult getLastTestResult(final String testCaseKey) throws HttpException {
        TestResult testResult;
        Response response;
        response = getTestCasesClient().getLastTestResultByTestCaseKey().testCaseKeyPath(testCaseKey)
                .execute(ResponseBody::peek).peek();
        if (response.getStatusCode() == SC_OK) {
            testResult = response.as(TestResult.class);
        } else {
            throw new HttpException("The Test Case (" + testCaseKey + ") was not found.");
        }
        return testResult;
    }

    /**
     * Get all trace links from a test result.
     *
     * @param testResult zephyr test result object
     * @return list of trace links
     */
    public List<String> getTraceLinks(final TestResult testResult) {
        List<String> traceList = new ArrayList<>();
        if (testResult.getTraceLinks() != null) {
            traceList.addAll(testResult.getTraceLinks());
        }
        if (testResult.getScriptResults() != null) {
            testResult.getScriptResults().forEach(scriptResult -> {
                if (scriptResult.getTraceLinks() != null) {
                    traceList.addAll(scriptResult.getTraceLinks());
                }
            });
        }
        return traceList;

    }

    /**
     * Test Result API
     */
    private TestResultApi getTestResultClient() {
        return getClient().testResult();
    }

    /**
     * Create a new test result for a test case.
     *
     * @param testResult test result object
     * @return test result id
     */
    public int createTestResultForTestCase(final TestResult testResult) {
        Response response;
        response = getTestResultClient().createTestResult()
                .body(testResult)
                .execute(ResponseBody::peek).peek();
        if (response.getStatusCode() == SC_CREATED) {
            return response.as(TestResult.class).getId();
        }
        return 0;
    }

    public int addTestResultAttachment(final int testResultId, final File attachmentFile) throws HttpException {
        Response response = getTestResultClient().createAttachmentsByTestResultId()
                .testResultIdPath(testResultId)
                .file(attachmentFile)
                .execute(ResponseBody::peek).peek();
        int statusCode = response.getStatusCode();
        if (statusCode == SC_CREATED) {
            return response.body().jsonPath().get("id");
        } else {
            throw new HttpException("Error creating attachment on test result");
        }
    }

}
