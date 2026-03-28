package Behavioral.Observer.StockMarketMonitor;

public class MobileApp implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Mobile App Notification: " + stockSymbol + " is now $" + price);
    }
}
