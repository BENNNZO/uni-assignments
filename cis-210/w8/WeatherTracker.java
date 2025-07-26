// Benjamin Phillips
// July 6, 2025
//
// Week 8 - Programming Assignment
// Weather Tracker

package w8;


// Represents daily weather data with wind speed and temperature.
class WeatherData {
    private int windSpeed;
    private int temperature;

    public WeatherData(int windSpeed, int temperature) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return windSpeed + " " + temperature;
    }
}