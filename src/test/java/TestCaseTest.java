import com.pt.taco.jira.zephyr.ZephyrRestClient;
import org.apache.http.HttpException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockserver.integration.ClientAndServer;

@ExtendWith(MockitoExtension.class)
class TestCaseTest {

    private ClientAndServer mockServer;
    private ZephyrRestClient apiClient;

    @BeforeEach
    void startServer() {
        mockServer = ClientAndServer.startClientAndServer(1080);
        apiClient = new ZephyrRestClient("http://localhost:1080", "username", "password");
    }


    @Test
    void getTestCase_404() {
        try {
            apiClient.getTestCase("TEST_CASE_404");
        } catch (HttpException e) {
            Assertions.assertEquals("The Test Case (TEST_CASE_404) was not found.", e.getMessage());
        }
    }

    @AfterEach
    void stopServer() {
        mockServer.stop();
    }


}


