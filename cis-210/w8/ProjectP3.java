package w8;

import java.util.Scanner;

public class ProjectP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name: ");
        String nameInput = scanner.nextLine();

        // Format name: remove non-letters, lowercase all, capitalize first letter
        String cleanedName = nameInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String formattedName = cleanedName.isEmpty() ? "User" :
                cleanedName.substring(0, 1).toUpperCase() + cleanedName.substring(1);

        // Prompt user for binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        // Validate binary input (only 0 and 1 allowed, no spaces or other characters)
        if (!binaryInput.matches("[01]+")) {
            System.out.println(formattedName);
            System.out.println("Invalid Binary Number");
        } else {
            // Count the number of 1's
            int onesCount = 0;
            for (char c : binaryInput.toCharArray()) {
                if (c == '1') {
                    onesCount++;
                }
            }

            // Output formatted name and even/odd based on 1's count
            System.out.println(formattedName);
            System.out.println((onesCount % 2 == 0) ? "Even" : "Odd");
        }

        scanner.close();
    }
}
