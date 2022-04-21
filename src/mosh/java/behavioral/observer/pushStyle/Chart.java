package behavioral.observer.pushStyle;

public class Chart implements Observer {
    private int value;
    private final Subject subject;

    public Chart(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println("chart is notified, value change to " + value);
    }

    public int getValue() {
        return value;
    }
}
