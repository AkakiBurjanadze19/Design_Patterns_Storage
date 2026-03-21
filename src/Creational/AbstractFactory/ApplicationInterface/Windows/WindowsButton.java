package Creational.AbstractFactory.ApplicationInterface.Windows;

import Creational.AbstractFactory.ApplicationInterface.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendered");
    }
}