import com.pt.taco.jira.zephyr.ZephyrRestClient;
import org.apache.http.HttpException;
import org.apache.http.auth.AuthenticationException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseTest {

    private MockServer mockServer;
    private ZephyrRestClient apiClient;

    @BeforeEach
    void startServer() {
        mockServer = new MockServer();
        apiClient = new ZephyrRestClient("http://localhost:1080");
    }


    @Test
    void getTestCase_401() {
        try {
            mockServer.register401();
            apiClient.getTestCase("401");
        } catch (AuthenticationException e) {
            Assertions.assertEquals("Client must be authenticated to access this resource.", e.getMessage());
        } catch (HttpException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getTestCase_404() {
        try {
            mockServer.register404();
            apiClient.getTestCase("404");
        } catch (HttpException e) {
            Assertions.assertEquals("The Test Case (404) was not found.", e.getMessage());
        }
    }

    @AfterEach
    void stopServer() {
        mockServer.stopServer();
    }

}


