// Benjamin Phillips
// July 6, 2025
//
// Week 8 - Programming Assignment
// Weather Tracker

package w8;

import java.util.Scanner;
import java.util.Arrays;

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

// Main application class for NOAA Weather Tracker.
public class WeatherTracker {
    // CLI interface for weather tracking.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherData[] data = new WeatherData[10]; // Array to store weather data
        int count = 0; // Number of records
        int choice;

        do {
            // Display menu
            System.out.println("\nWelcome to the NOAA Weather Tracker.");
            System.out.println("Menu Options");
            System.out.println("1) Input new daily weather data");
            System.out.println("2) Display all recorded weather data");
            System.out.println("3) Display recorded weather data sorted by temperature");
            System.out.println("4) Search recorded weather data for wind speed");
            System.out.println("5) Quit Application");
            System.out.print("Please select a menu option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input new weather data
                    if (count >= 10) {
                        System.out.println("Maximum of 10 days recorded.");
                        break;
                    }
                    System.out.println("Please enter daily weather data…");
                    System.out.print("Wind Speed (mph): ");
                    int wind = scanner.nextInt();
                    System.out.print("Daily Temperature (F): ");
                    int temp = scanner.nextInt();
                    data[count] = new WeatherData(wind, temp);
                    System.out.println("Daily weather data recorded for Day " + (count + 1));
                    count++;
                    break;

                case 2:
                    // Display all recorded data
                    System.out.println("Current Weather Data Table");
                    System.out.println("Day Wind Speed (mph) Daily Temperature (F)");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + " " + data[i].getWindSpeed() + " " + data[i].getTemperature());
                    }
                    break;

                case 3:
                    // Display data sorted by temperature
                    System.out.println("Sorted Weather Data Table [by Temperature]");
                    System.out.println("Day Wind Speed (mph) Daily Temperature (F)");
                    WeatherData[] sorted = Arrays.copyOf(data, count);
                    // Sort descending by temperature
                    for (int i = 0; i < sorted.length - 1; i++) {
                        for (int j = i + 1; j < sorted.length; j++) {
                            if (sorted[i].getTemperature() < sorted[j].getTemperature()) {
                                WeatherData tempData = sorted[i];
                                sorted[i] = sorted[j];
                                sorted[j] = tempData;
                            }
                        }
                    }
                    // Print sorted data with original day
                    for (int i = 0; i < sorted.length; i++) {
                        int originalDay = -1;
                        for (int j = 0; j < count; j++) {
                            if (data[j] == sorted[i]) {
                                originalDay = j + 1;
                                break;
                            }
                        }
                        System.out.println(originalDay + " " + sorted[i].getWindSpeed() + " " + sorted[i].getTemperature());
                    }
                    break;

                case 4:
                    // Search for wind speed
                    System.out.print("Please enter selected wind speed criteria (in mph): ");
                    int searchSpeed = scanner.nextInt();
                    System.out.println("Weather Data Table Search Results");
                    System.out.println("Day Wind Speed (mph) Daily Temperature (F)");
                    for (int i = 0; i < count; i++) {
                        if (data[i].getWindSpeed() == searchSpeed) {
                            System.out.println((i + 1) + " " + data[i].getWindSpeed() + " " + data[i].getTemperature());
                        }
                    }
                    break;

                case 5:
                    // Quit application
                    System.out.println("Quit selected. Exiting Application.");
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}