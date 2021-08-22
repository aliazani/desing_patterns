package Behavioral.Observer.Solution;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet got update.");
    }
}
