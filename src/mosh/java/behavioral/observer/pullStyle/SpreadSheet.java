package behavioral.observer.pullStyle;

public class SpreadSheet implements Observer{
    private int value;
    private Subject subject;

    public SpreadSheet(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Spread sheet update" + value);
    }
}
