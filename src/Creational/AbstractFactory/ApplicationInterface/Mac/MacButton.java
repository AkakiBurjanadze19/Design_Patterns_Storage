package Creational.AbstractFactory.ApplicationInterface.Mac;

import Creational.AbstractFactory.ApplicationInterface.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button rendered");
    }
}
