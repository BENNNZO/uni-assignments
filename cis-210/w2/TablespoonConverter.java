// Benjamin Phillips
// June 13, 2025
//
// Week 2 - Programming Assignment
// Tablespoon Converter

package w2;

// This class provides functionality to convert teaspoons to tablespoons and leftover teaspoons.
public class TablespoonConverter {
    public static void main(String[] args) {
        // The initial number of teaspoons to convert.
        final int INITIAL_TEASPOONS = 24;

        // Convert the initial teaspoons to tablespoons and leftover teaspoons.
        final Measurement RESULT = convertToTablespoons(INITIAL_TEASPOONS);

        // Print the formatted output of the conversion.
        printFormattedOutput(INITIAL_TEASPOONS, RESULT);
    }

    // Converts the given number of teaspoons to tablespoons and leftover teaspoons.
    static Measurement convertToTablespoons(int teaspoons) {
        final int TEASPOONS_PER_TABLESPOON = 3;

        // Calculate the number of whole tablespoons and leftover teaspoons.
        final int TABLESPOONS_NEEDED = teaspoons / TEASPOONS_PER_TABLESPOON;
        final int TEASPOONS_LEFTOVER = teaspoons % TEASPOONS_PER_TABLESPOON;

        // Return the result as a Measurement record.
        return new Measurement(TABLESPOONS_NEEDED, TEASPOONS_LEFTOVER);
    }

    // Prints the formatted output showing the initial and converted values.
    static void printFormattedOutput(int initialTeaspoons, Measurement values) {
        final String FORMATTED_STRING = String.format("""
                ----------------INITIAL----------------
                Teaspoons:    %d

                ---------------CONVERTED---------------
                Tablespoons:  %d
                Teaspoons:    %d
                """, initialTeaspoons, values.tablespoons(), values.leftoverTeaspoons());

        System.out.println(FORMATTED_STRING);
    }
}

// Record type for: number of tablespoons and leftover teaspoons.

// my formatter moves the bracket to a new line after save so I cant do
// anything without diabling it :(
record Measurement(int tablespoons, int leftoverTeaspoons) {
}