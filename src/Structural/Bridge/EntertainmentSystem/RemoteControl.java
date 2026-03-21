package Structural.Bridge.EntertainmentSystem;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.turnOn();
    }
}
