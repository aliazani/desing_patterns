package Behavioral.Observer.Solution.Pull;


public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got update: " + dataSource.getValue());
    }
}
