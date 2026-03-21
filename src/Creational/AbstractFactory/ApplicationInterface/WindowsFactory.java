package Creational.AbstractFactory;

import Creational.AbstractFactory.Windows.WindowsButton;
import Creational.AbstractFactory.Windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
