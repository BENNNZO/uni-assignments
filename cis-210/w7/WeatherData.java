// Benjamin Phillips
// July 20, 2025
//
// Week 7 - Programming Assignment

package w7;

public class WeatherData {
    // Instance variables for temperature and wind speed
    private double dailyTemp;
    private int windSpeed;

    // Default constructor initializes values to 0
    public WeatherData() {
        this.dailyTemp = 0;
        this.windSpeed = 0;
    }

    // Parameterized constructor
    public WeatherData(double dailyTemp, int windSpeed) {
        this.dailyTemp = dailyTemp;
        this.windSpeed = windSpeed;
    }

    // Getter for daily temperature
    public double getDailyTemp() {
        return dailyTemp;
    }

    // Getter for wind speed
    public int getWindSpeed() {
        return windSpeed;
    }

    // Setter for daily temperature
    public void setDailyTemp(double dailyTemp) {
        this.dailyTemp = dailyTemp;
    }

    // Setter for wind speed (only sets if positive)
    public void setWindSpeed(int windSpeed) {
        if (windSpeed > 0) {
            this.windSpeed = windSpeed;
        }
    }

    // Returns a string representation of the object
    public String toString() {
        return "Weather Data: Daily Temperature = " + this.dailyTemp + " F. Wind Speed = " + this.windSpeed + " mph";
    }

    // Checks if two WeatherData objects are equal
    public boolean equals(Object o) {
        if (!(o instanceof WeatherData)) {
            return false;
        } else {
            WeatherData a = (WeatherData) o;
            return this.dailyTemp == a.dailyTemp && this.windSpeed == a.windSpeed;
        }
    }
}