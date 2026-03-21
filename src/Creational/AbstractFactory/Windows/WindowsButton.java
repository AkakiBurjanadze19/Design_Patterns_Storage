package Creational.AbstractFactory.Windows;

import Creational.AbstractFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendered");
    }
}