package structural.facade;

public class NotificationService {
    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection conn = server.connect("127.0.0.1");
        AuthToken authToken = server.authenticate("jacky", "123456");
        server.send(authToken, new Message(message), target);
        conn.disconnect();
    }
}
