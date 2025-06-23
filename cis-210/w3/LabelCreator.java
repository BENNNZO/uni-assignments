package w3;

import java.util.Scanner;

public class LabelCreator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = askQuestion("What Is Your First Name", scan);
        String lastName = askQuestion("What Is Your Last Name", scan);
        String streetAddress = askQuestion("What Is Your Street Address", scan);
        String city = askQuestion("What Is Your City", scan);
        String state = askQuestion("What Is Your State", scan);

        String zipCode = askQuestion("What Is Your Zip Code", scan);
        while (!zipCode.matches("^\\d{5}$")) {
            System.out.println("Please Only Input 5 Digits For The Zip Code");
            zipCode = askQuestion("What Is Your Zip Code", scan);
        }
        
        String dateOfBirth = askQuestion("What Is Your Date of Birth (MM/DD/YYYY)", scan);
        while (!dateOfBirth.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$")) {
            System.out.println("Please Type Your Date Of Birth In This Formatt (MM/DD/YYYY)");
            dateOfBirth = askQuestion("What Is Your Date of Birth (MM/DD/YYYY)", scan);
        }

        printLabel(firstName, lastName, streetAddress, city, state, zipCode, dateOfBirth);

        scan.close();
    }

    static String askQuestion(String question, Scanner scan) {
        System.out.printf(" >> %s: ", question);

        return scan.nextLine();
    }

    static void printLabel(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String dateOfBirth) {
        System.out.printf("\n\n\nName: %s, %s\nAddress: %s, %s, %s %s\nDOB: %s\n", lastName, firstName, streetAddress, city, state, zipCode, dateOfBirth);
    }
}
