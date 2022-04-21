package behavioral.strategy;

public class HighContractFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("high contract Filter");
    }
}
