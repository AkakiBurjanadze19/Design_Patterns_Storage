package Creational.AbstractFactory;

import Creational.AbstractFactory.Mac.MacButton;
import Creational.AbstractFactory.Mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
