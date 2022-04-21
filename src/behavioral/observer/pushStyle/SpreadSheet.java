package behavioral.observer.pushStyle;

public class SpreadSheet implements Observer {
    private int value;
    private Subject subject;

    public SpreadSheet(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println("Spread sheet update: " + value);
    }
}
