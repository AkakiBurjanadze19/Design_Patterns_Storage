package Structural.Adapter.SmartHome;

public class Usage {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        LegacyThermostat legacyThermostat = new LegacyThermostat();

        Adapter adapter = new Adapter(legacyThermostat);
        hub.manageDevice(adapter);
    }
}
