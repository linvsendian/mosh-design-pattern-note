package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "123456"));

    }
}
