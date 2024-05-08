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

import static io.restassured.http.Method.POST;

public class CustomFieldApi {

    private final Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private CustomFieldApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static CustomFieldApi customField(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new CustomFieldApi(reqSpecSupplier);
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
                createCustomField(),
                createCustomFieldOptionByCustomFieldId()
        );
    }

    public CreateCustomFieldOper createCustomField() {
        return new CreateCustomFieldOper(createReqSpec());
    }

    public CreateCustomFieldOptionByCustomFieldIdOper createCustomFieldOptionByCustomFieldId() {
        return new CreateCustomFieldOptionByCustomFieldIdOper(createReqSpec());
    }

    /**
     * Customize request specification
     *
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public CustomFieldApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Creates a new custom field for test cases, test plans, test runs, test result or folder. The custom fied name must be unique by project and category.  Custom fields must have one of these categories: &#x60;TEST_PLAN&#x60;, &#x60;TEST_RUN&#x60;, &#x60;TEST_STEP&#x60;, &#x60;TEST_EXECUTION&#x60;, &#x60;TEST_CASE&#x60; or &#x60;FOLDER&#x60;.  Custom fields must have of these types: &#x60;SINGLE_LINE_TEXT&#x60;, &#x60;MULTI_LINE_TEXT&#x60;, &#x60;NUMBER&#x60;, &#x60;DATE&#x60;, &#x60;SINGLE_CHOICE_SELECT_LIST&#x60;, &#x60;CHECKBOX&#x60;, &#x60;DECIMAL&#x60;, &#x60;MULTI_CHOICE_SELECT_LIST&#x60; or &#x60;USER_LIST&#x60;.
     *
     * @see #body  (optional)
     * return Object
     */
    public static class CreateCustomFieldOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/rest/atm/1.0/rest/atm/1.0/customfield";

        private final RequestSpecBuilder reqSpec;
        private final ResponseSpecBuilder respSpec;

        public CreateCustomFieldOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType(ContentType.JSON);
            reqSpec.setAccept(ContentType.JSON);
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /customfield
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
         * POST /customfield
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
         * @param body (String)  (optional)
         * @return operation
         */
        public CreateCustomFieldOper body(String body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateCustomFieldOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateCustomFieldOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Creates a new custom field option for &#x60;SINGLE_CHOICE_SELECT_LIST&#x60; or &#x60;MULTI_CHOICE_SELECT_LIST&#x60; custom field.
     *
     * @see #customFieldIdPath  (required)
     * @see #body  (optional)
     * return Object
     */
    public static class CreateCustomFieldOptionByCustomFieldIdOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/rest/atm/1.0/customfield/{customFieldId}/option";
        public static final String CUSTOM_FIELD_ID_PATH = "customFieldId";
        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateCustomFieldOptionByCustomFieldIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /customfield/{customFieldId}/option
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
         * POST /customfield/{customFieldId}/option
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
         * @param body (String)  (optional)
         * @return operation
         */
        public CreateCustomFieldOptionByCustomFieldIdOper body(String body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * @param customFieldId (String)  (required)
         * @return operation
         */
        public CreateCustomFieldOptionByCustomFieldIdOper customFieldIdPath(Object customFieldId) {
            reqSpec.addPathParam(CUSTOM_FIELD_ID_PATH, customFieldId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateCustomFieldOptionByCustomFieldIdOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateCustomFieldOptionByCustomFieldIdOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
