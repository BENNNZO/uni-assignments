// Benjamin Phillips
// July 6, 2025
//
// Week 5 - Programming Assignment
// Rocket Launch

package w5;

import java.util.Scanner;

public class Week5Programming {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the sustained wind speed and store it
        System.out.print("Please enter sustained wind speed (in mph): ");
        int windSpeed = scan.nextInt();

        // Prompt the user for the current temperature and store it
        System.out.print("Please enter the current daily temperature (in F): ");
        int temperature = scan.nextInt();

        // Check if the launch conditions are met
        if (windSpeed > 30 || temperature < 41) {
            // If wind is too high or temperature is too low, abort the launch
            System.out.println("Weather conditions are poor. Abort rocket launch!");
        } else {
            // Otherwise, the rocket is clear for launch
            System.out.println("Weather conditions are good. The rocket is go for launch.");
        }

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}