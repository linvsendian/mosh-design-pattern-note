package behavioral.strategy;

public class BWFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("B&W Filter");
    }
}
