package Structural.Decorator.CoffeeShopSystem;

public class Caramel extends ToppingDecorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return Math.round(beverage.getCost() + 0.70);
    }
}
