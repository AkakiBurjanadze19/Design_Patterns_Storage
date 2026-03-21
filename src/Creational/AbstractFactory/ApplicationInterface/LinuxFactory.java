package Creational.AbstractFactory.ApplicationInterface;

import Creational.AbstractFactory.ApplicationInterface.Linux.LinuxButton;
import Creational.AbstractFactory.ApplicationInterface.Linux.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
