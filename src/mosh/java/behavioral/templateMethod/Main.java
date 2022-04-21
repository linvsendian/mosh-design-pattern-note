package behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        TransferMoneyTask task = new TransferMoneyTask();
        // 为什么这里可用的原因是处于同一个包内
        // https://blog.csdn.net/m0_37618340/article/details/81141952
        task.doExecute();

    }
}
