package Creational.AbstractFactory;

import Creational.AbstractFactory.Linux.LinuxButton;
import Creational.AbstractFactory.Linux.LinuxCheckbox;

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
