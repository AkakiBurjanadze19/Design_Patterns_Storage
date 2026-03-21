package Structural.Adapter.WeatherMonitoring;

public class NorthAmericanCity implements City {
    private String name;
    private double temperature;
    private boolean hasWeatherWarning;

    public NorthAmericanCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }
}
