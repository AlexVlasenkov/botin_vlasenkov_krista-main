import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.util.PortProvider;

public class WebAppServer {

    public static void main(String[] argv) {
        startWebServer();
    }

    /**
     * Запускает web-сервер. По окончании работы требуется ручная остановка процесса.
     */
    private static void startWebServer() {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(WebAppSingletons.class);
        System.out.println("Сервер запущен: http://localhost:" + PortProvider.getPort() + "/");
    }
}

