package behavioral.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    void handle(HttpRequest request){
        handler.handle(request);
    }
}
