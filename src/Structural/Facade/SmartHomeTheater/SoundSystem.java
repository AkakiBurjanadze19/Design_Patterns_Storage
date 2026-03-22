package Structural.Facade.SmartHomeTheater;

public class SoundSystem {
    public void on() {
        System.out.println("Sound system is on.");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to: " + level);
    }

    public void setSurroundSound() {
        System.out.println("Surround sound enabled.");
    }

    public void off() {
        System.out.println("Sound system is off.");
    }
}
