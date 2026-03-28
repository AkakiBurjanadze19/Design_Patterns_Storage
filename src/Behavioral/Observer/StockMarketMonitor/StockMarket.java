package Behavioral.Observer.StockMarketMonitor;

import java.util.List;
import java.util.ArrayList;

public class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private String symbol;
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        notifyObservers();
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(symbol, price));
    }
}