package Structural.Adapter.WeatherMonitoring;

public interface City {
    double getTemperature();
    String getTemperatureScale();
    String getName();
    void setHasWeatherWarning(boolean hasWeatherWarning);
}