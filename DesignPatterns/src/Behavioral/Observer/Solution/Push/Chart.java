package Behavioral.Observer.Solution.Push;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got update: " + value);
    }
}
