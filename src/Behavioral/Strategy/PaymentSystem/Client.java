package Behavioral.Strategy.PaymentSystem;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new PaypalStrategy("some_user@gmail.com"));
        cart.checkout(500);

        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234-5678"));
        cart.checkout(250);
    }
}
