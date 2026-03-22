package Structural.Facade.SmartHomeTheater;

public class SmartLights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%.");
    }

    public void brighten() {
        System.out.println("Lights are at full brightness.");
    }
}