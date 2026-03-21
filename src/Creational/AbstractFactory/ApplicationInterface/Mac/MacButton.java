package Creational.AbstractFactory.Mac;

import Creational.AbstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button rendered");
    }
}
