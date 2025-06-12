package w2;

public class TablespoonConverter {
    public static void main(String[] args) {
        final int INITIAL_TEASPOONS = 16;

        final Measurement RESULT = convertToTablespoons(INITIAL_TEASPOONS);

        printFormattedOutput(INITIAL_TEASPOONS, RESULT);
    }

    static Measurement convertToTablespoons(int teaspoons) {
        final int TEASPOONS_PER_TABLESPOON = 3;

        final int TABLESPOONS_NEEDED = teaspoons / TEASPOONS_PER_TABLESPOON;
        final int TEASPOONS_LEFTOVER = teaspoons % TEASPOONS_PER_TABLESPOON;

        return new Measurement(TABLESPOONS_NEEDED, TEASPOONS_LEFTOVER);
    }

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

record Measurement(int tablespoons, int leftoverTeaspoons) {
}