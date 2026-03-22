package Structural.Facade.SmartHomeTheater;

public class TV {
    public void on() {
        System.out.println("TV is on.");
    }

    public void setInput(String input) {
        System.out.println("Setting TV input to: " + input);
    }

    public void off() {
        System.out.println("TV is off.");
    }
}
