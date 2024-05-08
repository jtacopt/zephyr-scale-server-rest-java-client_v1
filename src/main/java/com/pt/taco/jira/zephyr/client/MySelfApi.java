package com.pt.taco.jira.zephyr.client;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.GET;

public class MySelfApi {

    private final Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private MySelfApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static MySelfApi mySelf(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new MySelfApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if (reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public GetCurrentUserOper getCurrentUser() {
        return new GetCurrentUserOper(createReqSpec());
    }

    public static class GetCurrentUserOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/rest/api/2/myself";

        private final RequestSpecBuilder reqSpec;
        private final ResponseSpecBuilder respSpec;


        public GetCurrentUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept(ContentType.JSON);
            this.respSpec = new ResponseSpecBuilder();
        }

        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured
                    .given().spec(reqSpec.build()).expect().spec(respSpec.build())
                    .when().request(REQ_METHOD, REQ_URI));

        }
    }
}
