/*
 * Zephyr Scale Server API (v1)
 * ## DISCLAIMER  We strongly discourage and do not endorse using private APIs for any purpose. Important points to remember:  1. **Non-Endorsement**: We do not support or endorse private API usage.  2. **API Changes**: Private APIs may change without notice; use them at your own risk.  3. **Data Responsibility**: We are not responsible for issues arising from private API use, such ***as data corruption***.  Please follow our terms of service and official ***public*** APIs for a stable and secure application experience. Unauthorized private API use may lead to instability and ***data corruption***.  ## Accessing the API The Zephyr Scale REST API is ready to use if you have Zephyr Scale installed on your JIRA instance. All API uses the following base URL: ``` http://your-jira-host:port/your-jira-context/rest/atm/1.0/ ``` For instance, you can create test results using the \"testresult\" api: ``` POST http://localhost:2990/jira/rest/atm/1.0/testresult ```  ## Authentication Basics Any authentication that works with JIRA will work with the Zephyr Scale REST API. The prefered authentication methods are OAuth and HTTP Basic. See the [JIRA SERVER REST API](https://developer.atlassian.com/server/jira/platform/rest-apis) docs for details. ## Using Status and Environment Fields Some entities, such as the Test Results, may have status and environment fields. The values of these fields are identified by name, not by the localized name. Both fields may have custom values defined by the user on the Zephyr Scale configuration area. All values are **case sensitive**, and they must be set just as displayed on the add-on.  These are the default values, which must be used on the APIs instead of their localized versions: * Test Cases:   * Draft   * Approved   * Deprecated  * Test Runs:   * Not Executed   * In Progress   * Done  * Test Results:   * Not Executed   * In Progress   * Pass   * Fail   * Blocked ## Handling Date Format The API supports the ISO 8601 format for date/time fields. This allows you to pass in the level of detail you need to. When a field is not specified, the earliest possible value is the default. For example, if you do not specify a time of day, we will default to 00:00 (midnight). Similarly, not specifying a timezone defaults the timezone to GMT. The full representation is of the format: ``` yyyy-MM-ddTHH:mm:ss.SSSZ ``` This table illustrates some example valid dates and times:  | Input | Equivalent to | | ------ | ----------- | | 2016 | 2016-01-01T00:00:00.000Z | | 2016-04 | 2016-04-01T00:00:00.000Z | | 2016-04-15 | 2016-04-15T00:00:00.000Z | | 2016-04-15T16 | 2016-04-15T16:00:00.000Z | | 2016-04-15T16:15 | 2016-04-15T16:15:00.000Z | | 2016-04-15T16:15Z | 2016-04-15T16:15:00.000Z (GMT time zone) | | 2016-04-15T16:15-0300 | 2016-04-15T16:15:00.000-0300 (Brazil time zone) |
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pt.taco.jira.zephyr.client;

import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.GET;
import static io.restassured.http.Method.POST;

public class AutomationApi {

    private final Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private AutomationApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static AutomationApi automation(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new AutomationApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if (reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                createAutomationExecutionCucumberByProjectKey(),
                createAutomationTestCycleByProjectKey(),
                getCucumberFeatureFiles()
        );
    }

    public CreateAutomationExecutionCucumberByProjectKeyOper createAutomationExecutionCucumberByProjectKey() {
        return new CreateAutomationExecutionCucumberByProjectKeyOper(createReqSpec());
    }

    public CreateAutomationTestCycleByProjectKeyOper createAutomationTestCycleByProjectKey() {
        return new CreateAutomationTestCycleByProjectKeyOper(createReqSpec());
    }

    public GetCucumberFeatureFilesOper getCucumberFeatureFiles() {
        return new GetCucumberFeatureFilesOper(createReqSpec());
    }

    /**
     * Customize request specification
     *
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public AutomationApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Creates a new Test Cycle based on provided automated test results. This endpoint receives a zip file containing one or more [Cucumber Json Output file](https://relishapp.com/cucumber/cucumber/docs/formatters/json-output-formatter). Optionally, you can send a &#x60;testCycle&#x60; part in your form data to customize the created Test Cycle.
     *
     * @see #projectKeyPath The key of the Project. (required)
     * return Object
     */
    public static class CreateAutomationExecutionCucumberByProjectKeyOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/rest/atm/1.0/automation/execution/cucumber/{projectKey}";
        public static final String PROJECT_KEY_PATH = "projectKey";
        private final RequestSpecBuilder reqSpec;
        private final ResponseSpecBuilder respSpec;

        public CreateAutomationExecutionCucumberByProjectKeyOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("multipart/form-data");
            reqSpec.setAccept(ContentType.JSON);
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /automation/execution/cucumber/{projectKey}
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /automation/execution/cucumber/{projectKey}
         *
         * @param handler handler
         * @return Object
         */
        public Object executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Object>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param projectKey (String) The key of the Project. (required)
         * @return operation
         */
        public CreateAutomationExecutionCucumberByProjectKeyOper projectKeyPath(Object projectKey) {
            reqSpec.addPathParam(PROJECT_KEY_PATH, projectKey);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateAutomationExecutionCucumberByProjectKeyOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateAutomationExecutionCucumberByProjectKeyOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Creates a new Test Cycle based on provided automated test results. This endpoint receives a zip file containing one or more Zephyr Scale Test Results File Format to create the Test Cycle. See [Zephyr Scale JUnit Integration](https://bitbucket.org/smartbeartm4j/tm4j-junit-integration) to learn how to generate this file. Optionally, you can send a &#x60;testCycle&#x60; part in your form data to customize the created Test Cycle.
     *
     * @see #projectKeyPath The key of the Project. (required)
     * return Object
     */
    public static class CreateAutomationTestCycleByProjectKeyOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/rest/atm/1.0/automation/execution/{projectKey}";
        public static final String PROJECT_KEY_PATH = "projectKey";
        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateAutomationTestCycleByProjectKeyOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType(ContentType.MULTIPART);
            reqSpec.setAccept(ContentType.JSON);
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /automation/execution/{projectKey}
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /automation/execution/{projectKey}
         *
         * @param handler handler
         * @return Object
         */
        public Object executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Object>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param projectKey (String) The key of the Project. (required)
         * @return operation
         */
        public CreateAutomationTestCycleByProjectKeyOper projectKeyPath(Object projectKey) {
            reqSpec.addPathParam(PROJECT_KEY_PATH, projectKey);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateAutomationTestCycleByProjectKeyOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateAutomationTestCycleByProjectKeyOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Retrieve a zip file containing Cucumber Feature Files that matches the tql passed as parameter.
     *
     * @see #tqlQuery A Zephyr Scale TQL to filter Test Cases. The param syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;. * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60;  Usage examples: * testCase.projectKey &#x3D; &#39;JQA&#39; * testCase.projectKey IN (&#39;JQA&#39;, &#39;JQB&#39;)  (required)
     */
    public static class GetCucumberFeatureFilesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/rest/atm/1.0/automation/testcases";
        public static final String TQL_QUERY = "tql";
        private final RequestSpecBuilder reqSpec;
        private final ResponseSpecBuilder respSpec;

        public GetCucumberFeatureFilesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept(ContentType.JSON);
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /automation/testcases
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * @param tql (String) A Zephyr Scale TQL to filter Test Cases. The param syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;. * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60;  Usage examples: * testCase.projectKey &#x3D; &#39;JQA&#39; * testCase.projectKey IN (&#39;JQA&#39;, &#39;JQB&#39;)  (required)
         * @return operation
         */
        public GetCucumberFeatureFilesOper tqlQuery(Object... tql) {
            reqSpec.addQueryParam(TQL_QUERY, tql);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetCucumberFeatureFilesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetCucumberFeatureFilesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
