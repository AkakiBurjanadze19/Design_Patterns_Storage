package Structural.Bridge.EntertainmentSystem;

public class Radio implements Device {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned off");
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Radio volume set to " + percent);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}