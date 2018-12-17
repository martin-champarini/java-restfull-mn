package example.controller;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookControllerTest {

    private static EmbeddedServer server;
    private static HttpClient client;

    @BeforeClass
    public static void setUp() throws Exception {

        server = ApplicationContext.run(EmbeddedServer.class);
        client = server
                .getApplicationContext()
                .createBean(HttpClient.class, server.getURL());
    }

    @AfterClass
    public static void stopServer() {
        if (server != null) {
            server.stop();
        }
        if (client != null) {
            client.stop();
        }
    }

    @Test
    public void getBook() {
        HttpRequest request = HttpRequest.GET("/books/book");
        String body = client.toBlocking().retrieve(request);
        assertNotNull(body);
        assertEquals(
                body,
                "{\"idBook\":1,\"title\":\"MyNotes\",\"price\":30.2}"
        );

    }
}