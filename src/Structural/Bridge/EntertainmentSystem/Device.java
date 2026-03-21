package Structural.Bridge.EntertainmentSystem;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int percent);
    int getVolume();
}
