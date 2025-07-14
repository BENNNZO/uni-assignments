package w6;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Week6Programming {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in); // Create scanner for user input
        int answer = 1;

        answer = menuSelectFunction(scan); // Show menu and get user choice

        while (answer == 1) {
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
                countDown(); // Start countdown
                System.out.println("Launch successful!");
                break; // Exit loop after successful launch
            }
            
            answer = menuSelectFunction(scan); // Show menu again if launch aborted
        }
        
        // Close the scanner to prevent resource leaks
        System.out.println("Process Closed!");
        scan.close();
       
    }

    // Method to print countdown from 10 to 0 with 1 second delay
    static void countDown() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    // Method to display menu and get valid user selection
    static int menuSelectFunction(Scanner scan) {
        int answer = 0;

        while (answer != 1 && answer != 2) {
            System.out.println(
                "Would you like to…\n" +
                "    1) Enter Current Weather Criteria\n" +
                "    2) Quit Program\n"
            );

            if (scan.hasNextInt()) {
                answer = scan.nextInt();
                scan.nextLine(); // clear newline
            } else {
                scan.nextLine(); // clear invalid input
            }
        }

        return answer;
    }
}