package w2;

public class TablespoonConverter {
    public static void main(String[] args) {
        final int TSP_IN_TBS = 3;

        final int TEASPOONS = 16;

        final int TABLESPOONS_NEEDED = TEASPOONS / TSP_IN_TBS;

        final int TEASPOONS_LEFTOVER = TEASPOONS % TSP_IN_TBS;

        System.out.println(TEASPOONS);
        System.out.println(TABLESPOONS_NEEDED);
        System.out.println(TEASPOONS_LEFTOVER);
    }
}
