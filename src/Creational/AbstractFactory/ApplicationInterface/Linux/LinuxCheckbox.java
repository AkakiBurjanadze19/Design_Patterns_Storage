package Creational.AbstractFactory.ApplicationInterface.Linux;

import Creational.AbstractFactory.ApplicationInterface.Checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Linux checkbox rendered");
    }
}