package day32;

public class AlphabetInRange {
    public static void main(String[] args) {


        printAlphabetInRange('a', 'f');
        printAlphabetInRange('G', 'B');
        printAlphabetInRange('A', 'A');
        printAlphabetInRange('a', 'A');
        printAlphabetInRange('Z', 'a');

    }


    /**
     * if beginning character is before ending character
     * for example beginning A , ending D  -->> ABCD
     * we did similar action with printing A-Z
     * <p>
     * if beginning character is after ending character
     * for example beginning D , ending A  -->> DCBA
     * we did similar action with printing Z-A
     */
    public static void printAlphabetInRange(char beginning, char ending) {
        // this mean beginning character comes before ending character
        // in ascii table
        if (beginning < ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();
            // this mean beginning character comes after ending character
            // in ascii table
        } else if (beginning > ending) {
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();

        } else {
            System.out.println("THEY ARE SAME CHARACTER!!!!");
        }
    }









}




