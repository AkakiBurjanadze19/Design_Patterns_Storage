package Creational.AbstractFactory.Windows;

import Creational.AbstractFactory.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox rendered");
    }
}
