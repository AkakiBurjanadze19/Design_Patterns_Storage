package Behavioral.Observer.StockMarketMonitor;

public interface Observer {
    void update(String stockSymbol, double price);
}
