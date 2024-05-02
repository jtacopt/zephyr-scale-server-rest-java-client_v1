import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

class MockServer {

    private static final Integer MOCK_SERVER_PORT = 1080;
    private final ClientAndServer clientAndServer;

    private final MockServerClient mockServerClient = new MockServerClient("localhost", MOCK_SERVER_PORT);

    public MockServer() {
        clientAndServer = ClientAndServer.startClientAndServer(MOCK_SERVER_PORT);
    }

    public void register401() {
        mockServerClient
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/rest/atm/1.0/testcase/401"))
                .respond(
                        response()
                                .withStatusCode(401)
                );
    }

    public void register404() {
        mockServerClient
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/rest/atm/1.0/testcase/404"))
                .respond(
                        response()
                                .withStatusCode(404)
                );

    }

    public void stopServer() {
        clientAndServer.stop();
    }
}

