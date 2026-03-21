package Creational.AbstractFactory.ApplicationInterface.Linux;

import Creational.AbstractFactory.ApplicationInterface.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux button rendered");
    }
}
