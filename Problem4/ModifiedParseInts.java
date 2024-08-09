package Problem4;


// ****************************************************************
// ModifiedParseInts.java
//
// Reads a line of text and prints the sum of all the digits in the line.
// If the input contains non-digit characters, those characters are skipped.
//          
// ****************************************************************

import java.util.Scanner;

public class ModifiedParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scan.nextLine();

        // Iterate through each character in the input line
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            try {
                // Try to convert the character to an integer and add it to the sum
                int digit = Integer.parseInt(String.valueOf(ch));
                sum += digit;
            } catch (NumberFormatException e) {
                // If the character is not a digit, skip it (do nothing)
            }
        }

        // Print the sum of the digits found in the input
        System.out.println("The sum of the digits in this line is " + sum);
    }
}
