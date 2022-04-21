package behavioral.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next){
        super(next);
    }
    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = ( request.getUserName() == "admin" &&
                request.getPassword() == "123456");
        System.out.println("authentication");
        return !isValid;
    }
}
