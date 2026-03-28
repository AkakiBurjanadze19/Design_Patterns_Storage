package Behavioral.Observer.StockMarketMonitor;

public class TradingBot implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        if (price < 150.00) {
            System.out.println("Trading Bot: Selling " + stockSymbol + " due to price drop!");
        }
    }
}