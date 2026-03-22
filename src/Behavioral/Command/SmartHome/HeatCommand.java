package Behavioral.Command.SmartHome;

public class HeatCommand implements Command {
    private Thermostat thermostat;

    public HeatCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.heat();
    }
}