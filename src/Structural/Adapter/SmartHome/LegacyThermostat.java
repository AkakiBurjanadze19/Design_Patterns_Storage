package Structural.Adapter.SmartHome;

class LegacyThermostat {
    public void powerUp() {
        System.out.println("Legacy Power: ON");
    }

    public void applyHeatLevel(int fahrenheit) {
        System.out.println("Setting legacy heat to: " + fahrenheit + "F");
    }
}