import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.test.TestPortProvider;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class AuthorRestTest {

    private static Client client;
    private static UndertowJaxrsServer server;
    private static WebTarget deleteNewUrl1;
    private static WebTarget deleteNewUrl12;

    @BeforeClass
    public static void init() {
        client = ClientBuilder.newClient();
        deleteNewUrl1 = client.target(TestPortProvider.generateURL("/rest/deleteNewById/1"));
        deleteNewUrl12 = client.target(TestPortProvider.generateURL("/rest/deleteNewById/12"));
        server = new UndertowJaxrsServer().start();
        server.deploy(WebAppSingletons.class);
    }

    @Test
    public void deleteNewById() {
        Response response  = deleteNewUrl1.request().get();
        Boolean bool = response.readEntity(Boolean.class);
        Assert.assertEquals(true, bool);

        response  = deleteNewUrl12.request().get();
        bool = response.readEntity(Boolean.class);
        Assert.assertEquals(false, bool);
    }

    @AfterClass
    public static void stop() {
        client.close();
        server.stop();
    }

}
