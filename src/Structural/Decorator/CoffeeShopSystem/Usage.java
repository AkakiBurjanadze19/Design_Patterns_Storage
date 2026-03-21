package Structural.Decorator.CoffeeShopSystem;

public class Usage {
    public static void main(String[] args) {
        Beverage order1 = new Espresso();
        Beverage order2 = new Milk(new Espresso());
        Beverage order3 = new Caramel(new Milk(new Espresso()));

        System.out.println(order1.getDescription());
        System.out.println(order1.getCost());

        System.out.println("--------------------");

        System.out.println(order2.getDescription());
        System.out.println(order2.getCost());

        System.out.println("--------------------");

        System.out.println(order3.getDescription());
        System.out.println(order3.getCost());
    }
}
