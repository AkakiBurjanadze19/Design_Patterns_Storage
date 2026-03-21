package Creational.AbstractFactory.ApplicationInterface;

import Creational.AbstractFactory.ApplicationInterface.Mac.MacButton;
import Creational.AbstractFactory.ApplicationInterface.Mac.MacCheckbox;

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
