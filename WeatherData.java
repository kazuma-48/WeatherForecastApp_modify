public class WeatherData {
    private final String time;
    private final String weather;

    public WeatherData(String time, String weather) {
        this.time = time;
        this.weather = weather;
    }

    public String getTime() {
        return time;
    }

    public String getWeather() {
        return weather;
    }
}