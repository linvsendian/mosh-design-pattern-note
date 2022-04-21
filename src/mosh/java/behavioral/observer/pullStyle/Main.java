package behavioral.observer.pullStyle;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Chart chart = new Chart(dataSource);
        SpreadSheet sheet1 = new SpreadSheet(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(sheet1);
        dataSource.setValue(1);
        System.out.println(chart.getValue());






    }
}
