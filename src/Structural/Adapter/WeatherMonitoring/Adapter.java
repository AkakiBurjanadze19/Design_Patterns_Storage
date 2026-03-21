package Structural.Adapter.WeatherMonitoring;

public class Adapter implements City {
    private City city;

    public Adapter(City city) {
        this.city = city;
    }

    @Override
    public double getTemperature() {
        double temperature = city.getTemperature();
        return (temperature * 1.8) + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}