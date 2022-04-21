package structural.facade;

public class NotificationServer {
    // connect() -> Connection
    // authenticate(AppID, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect()
    public Connection connect(String ipAddress){
        return new Connection();
    }
    public AuthToken authenticate(String AppID, String key){
        return new AuthToken();
    }
    public void send(AuthToken authToken, Message message, String target){
        System.out.println("sending a message");
    }
}
