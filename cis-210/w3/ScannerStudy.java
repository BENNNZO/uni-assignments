package w3;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        getName(scan);
        getBirthYear(scan);
        guessingGame(scan);

        scan.close();
    }

    static String getName(Scanner scan) {
        printDivider("Get Name");
        System.out.print("Enter Your First Name: ");
        String name = scan.next();
        System.err.println("Hello, " + name);
        System.out.println("Your name has " + name.length() + " letters!");

        return name;
    }

    static int getBirthYear(Scanner scan) {
        printDivider("Get Year");
        System.out.print("What Year Where Your Born: ");
        int birthYear = scan.nextInt();
        int thisYear = Year.now().getValue();
        int age = thisYear - birthYear;
        System.out.println("This year you will be " + age + " year(s) old!");

        final double LIFE_EXPECTANCY = 78.94;
        double percentLived = age / LIFE_EXPECTANCY;
        DecimalFormat percent = new DecimalFormat("0.0%");
        System.out.println("So far you have lived " + percent.format(percentLived) + " if your expected life span!");

        return birthYear;
    }

    static void guessingGame(Scanner scan) {
        Random rand = new Random();
        int secret = rand.nextInt(20);

        printDivider("Guess Game");
        System.out.println("I'm thinking of a number between 1 and 20.");
        System.out.print("Take a guess at what that number is: ");
        int guess = scan.nextInt();

        int difference = Math.abs(secret - guess);
        printDivider("");
        System.out.println("The secret number was: " + secret);
        System.out.println("Your guess was " + difference + " away!");
    }

    static void printDivider(String text) {
        System.out.println("-------------------------- " + text + " --------------------------");
    }
}
