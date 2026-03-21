package Creational.AbstractFactory.Mac;

import Creational.AbstractFactory.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac checkbox rendered");
    }
}
