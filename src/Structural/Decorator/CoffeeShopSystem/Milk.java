package Structural.Decorator.CoffeeShopSystem;

public class Milk extends ToppingDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return Math.round(beverage.getCost() + 0.50);
    }
}