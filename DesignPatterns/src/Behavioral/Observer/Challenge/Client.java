package Behavioral.Observer.Challenge;

public class Client {
    public static void main(String[] args) {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("Stock1", 10);
        var stock2 = new Stock("Stock2", 20);
        var stock3 = new Stock("Stock3", 30);

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        stock2.setPrice(25);
        stock3.setPrice(35);
    }
}
