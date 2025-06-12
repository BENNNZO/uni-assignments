// Benjamin Phillips
// June 6, 2025
//
// Week 1 - Programming Assignment
// Life bucket list

package w1;

public class LifeBucketList {
    public static void main(String[] args) {
        String[] listItems = { // array of list items
                "Make six figures at some point",
                "Create my own project / web application",
                "Use my phone less than an hour a day",
                "Stop caring what others think",
                "Drive an F1 car",
                "Own a square mile of flat pavement to do whatever I want on (mainly to setup drift / race tracks)",
                "Retire early",
        };

        for (String item : listItems) { // loop over each list item and print to stdout
            System.out.println(item);
        }

        System.exit(0); // exit program
    }
}