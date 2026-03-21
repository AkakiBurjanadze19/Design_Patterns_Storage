package Structural.Adapter.SmartHome;

public class SmartHomeHub {
    public void manageDevice(SmartDevice device) {
        System.out.println("Initializing device...");
        device.turnOn();
        device.setTemperature(22.0);
    }
}