package behavioral.observer.pullStyle;

public class Chart implements Observer{
    private int value;

    private final DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        value = dataSource.getValue();
        System.out.println("chart update..." + value);
    }

    public int getValue() {
        return value;
    }
}
