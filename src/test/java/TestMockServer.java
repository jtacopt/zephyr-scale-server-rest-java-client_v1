import org.mockserver.client.server.MockServerClient;

import static org.mockserver.matchers.Times.exactly;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class TestMockServer {

    private void createExpectationForInvalidAuth() {
        new MockServerClient("127.0.0.1", 1080)
                .when(
                        request()
                                .withMethod("POST")
                                .withPath("/testcase/"),
                        exactly(1))
                .respond(
                        response()
                                .withStatusCode(404)
                );
    }

}
