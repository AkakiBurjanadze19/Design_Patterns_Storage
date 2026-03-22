package Behavioral.Command.SmartHome;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        RemoteControl lightControl = new RemoteControl(new LightonCommand(light));
        RemoteControl heatingControl = new RemoteControl(new HeatCommand(thermostat));

        lightControl.pressButton();
        heatingControl.pressButton();
    }
}
