package Structural.Bridge.EntertainmentSystem;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Processing voice command...");
        System.out.println(command);
    }
}
