// Benjamin Phillips
// July 13, 2025
//
// Week 6 - Project Part 2
// Rocket Launch

package w6;

import java.util.Scanner;

public class Week6ProjectPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object for user input
        int response = 3; // Initialize response variable

        while (true) { // Loop until valid input is received
            System.out.print("Please input a binary number (0 or 1): ");

            if (scan.hasNextInt()) { // Check if input is an integer
                int input = scan.nextInt(); // Read the integer input
                if (checkIfBinary(input)) { // Check if input is 0 or 1
                    response = input; // Store valid input
                    break; // Exit loop
                } else {
                    System.out.println("Please input 0 or 1, nothing else."); // Invalid input message
                }
            } else {
                System.out.println("Please input 0 or 1, nothing else."); // Invalid input message
                scan.next(); // Consume invalid input
            }
        }

        System.out.println("Yay user responded with: " + response); // Print the valid input

        scan.close();
    }

    // Method to check if the number is binary (0 or 1)
    static boolean checkIfBinary(int number) {
        return (number == 1 || number == 0);
    }
}