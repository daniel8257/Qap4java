
import java.util.Scanner;

public class ModifiedCountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to hold the count of each letter (A-Z)
        Scanner scan = new Scanner(System.in);

        // Get word or phrase from user
        System.out.print("Enter a word or phrase (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case
        word = word.toUpperCase();

        // Count frequency of each letter in the string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Print a message indicating that a non-letter character was encountered
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Print the frequencies of each letter
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
