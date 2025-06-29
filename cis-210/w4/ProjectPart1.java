package w4;

import java.util.Scanner;

public class ProjectPart1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Input Your First Name: ");
        String firstName = scan.nextLine().trim();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("First Name: " + firstName);

        scan.close();
    }
}