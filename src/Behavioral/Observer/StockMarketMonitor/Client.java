package Behavioral.Observer.StockMarketMonitor;

public class Client {
    public static void main(String[] args) {
        StockMarket nvidiaStock = new StockMarket();

        Observer phone = new MobileApp();
        Observer bot = new TradingBot();

        nvidiaStock.addObserver(phone);
        nvidiaStock.addObserver(bot);

        nvidiaStock.setPrice("NVIDIA Corporation", 99.48);
    }
}