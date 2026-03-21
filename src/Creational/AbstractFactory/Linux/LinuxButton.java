package Creational.AbstractFactory.Linux;

import Creational.AbstractFactory.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux button rendered");
    }
}
