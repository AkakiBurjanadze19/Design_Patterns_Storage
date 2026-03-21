package Creational.AbstractFactory.ApplicationInterface.Windows;

import Creational.AbstractFactory.ApplicationInterface.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox rendered");
    }
}
