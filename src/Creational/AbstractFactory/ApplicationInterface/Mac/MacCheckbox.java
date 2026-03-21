package Creational.AbstractFactory.ApplicationInterface.Mac;

import Creational.AbstractFactory.ApplicationInterface.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac checkbox rendered");
    }
}
