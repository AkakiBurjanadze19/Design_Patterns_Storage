package Creational.AbstractFactory.Linux;

import Creational.AbstractFactory.Checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Linux checkbox rendered");
    }
}