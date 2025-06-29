// Benjamin Phillips
// June 29, 2025
//
// Week 4 - Project Part 1
// Get First Name

package w4;

import java.util.Scanner;

public class ProjectPart1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: " + getFirstName(scan));

        scan.close();
    }

    static String getFirstName(Scanner scan) {
        System.out.print("Please Input Your First Name: ");
        String firstName = scan.nextLine().trim();
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }
}