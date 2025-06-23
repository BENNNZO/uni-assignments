package w3;

import java.util.Scanner;

public class LabelCreator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user for their first name
        String firstName = askQuestion("What Is Your First Name", scan);
        // Prompt user for their last name
        String lastName = askQuestion("What Is Your Last Name", scan);
        // Prompt user for their street address
        String streetAddress = askQuestion("What Is Your Street Address", scan);
        // Prompt user for their city
        String city = askQuestion("What Is Your City", scan);
        // Prompt user for their state
        String state = askQuestion("What Is Your State", scan);

        // Prompt user for their zip code and validate it is 5 digits
        String zipCode = askQuestion("What Is Your Zip Code", scan);
        while (!zipCode.matches("^\\d{5}$")) { // Check if zip code is exactly 5 digits
            System.out.println("Please Only Input 5 Digits For The Zip Code");
            zipCode = askQuestion("What Is Your Zip Code", scan);
        }
        
        // Prompt user for their date of birth and validate the format MM/DD/YYYY
        String dateOfBirth = askQuestion("What Is Your Date of Birth (MM/DD/YYYY)", scan);
        while (!dateOfBirth.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$")) { // Check date format
            System.out.println("Please Type Your Date Of Birth In This Formatt (MM/DD/YYYY)");
            dateOfBirth = askQuestion("What Is Your Date of Birth (MM/DD/YYYY)", scan);
        }

        // Print the formatted label with the collected information
        printLabel(firstName, lastName, streetAddress, city, state, zipCode, dateOfBirth);

        scan.close(); // Close the scanner
    }

    // Helper method to ask a question and return the user's input
    static String askQuestion(String question, Scanner scan) {
        System.out.printf(" >> %s: ", question);
        return scan.nextLine();
    }

    // Helper method to print the label in a formatted way
    static void printLabel(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String dateOfBirth) {
        System.out.printf("\n\n\nName: %s, %s\nAddress: %s, %s, %s %s\nDOB: %s\n", lastName, firstName, streetAddress, city, state, zipCode, dateOfBirth);
    }
}
