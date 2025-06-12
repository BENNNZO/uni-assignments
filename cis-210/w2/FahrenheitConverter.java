// Benjamin Phillips
// June 11, 2025
//
// Week 2 - Programming Assignment
// Life bucket list

package w2;

public class FahrenheitConverter {
    public static void main(String[] args) {
        // Freezing point of water in Fahrenheit
        final int FREEZING_POINT = 32;

        // Initial temperature in Fahrenheit
        double fahrenheitTemp = 78.6;

        // Convert Fahrenheit to Celsius using the formula: C = 5/9 * (F - 32)
        double celciusTemp = 5 / 9.0 * (fahrenheitTemp - FREEZING_POINT);

        // Print the result of the conversion
        printResult(fahrenheitTemp, celciusTemp);

        // Convert Celsius back to Fahrenheit using the formula: F = C * 9/5 + 32
        fahrenheitTemp = (int) (celciusTemp * 9 / 5.0) + 32;

        // Print the result of the reverse conversion
        printResult(fahrenheitTemp, celciusTemp);
    }

    // Prints the Fahrenheit and Celsius values in a formatted way
    static void printResult(double fahrenheit, double celcius) {
        String formattedOutput = String.format("Fahrenheit: %.1f %nCelcius: %.1f", fahrenheit, celcius);
        System.out.println(formattedOutput);
    }
}