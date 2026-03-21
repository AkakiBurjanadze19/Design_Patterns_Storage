package Structural.Bridge.EntertainmentSystem;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
