package Structural.Adapter.SmartHome;

public class Adapter implements SmartDevice {
    private LegacyThermostat thermostat;

    public Adapter(LegacyThermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        thermostat.powerUp();
    }

    @Override
    public void setTemperature(double temperature) {
        double fahrenheit = (temperature * 1.8) + 32;
        thermostat.applyHeatLevel((int) fahrenheit);
    }
}