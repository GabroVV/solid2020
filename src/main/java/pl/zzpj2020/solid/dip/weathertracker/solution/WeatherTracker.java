package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    WeatherAlerter weatherAlerter;
    public WeatherTracker(WeatherAlerter weatherAlerter) {
        this.weatherAlerter = weatherAlerter;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy" || weatherDescription == "sunny") {
            String alert = weatherAlerter.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
