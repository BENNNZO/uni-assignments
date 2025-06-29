// Benjamin Phillips
// June 29, 2025
//
// Week 4 - Project Part 1
// Get First Name

package w4;

import java.util.Scanner;

public class ProjectPart1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Call getFirstName and print the result
        System.out.println("First Name: " + getFirstName(scan));

        // Close the Scanner to free resources
        scan.close();
    }

    static String getFirstName(Scanner scan) {
        // Prompt the user for their first name
        System.out.print("Please Input Your First Name: ");
        String firstName = scan.nextLine();

        // Remove any characters that are not letters, digits, or spaces
        firstName = firstName.replaceAll("[^a-zA-Z0-9 ]", "");
        // Trim leading and trailing whitespace
        firstName = firstName.trim();
        // Capitalize the first letter and make the rest lowercase
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        
        return firstName;
    }
}