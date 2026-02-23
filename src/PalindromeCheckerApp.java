/*
 * Palindrome Checker App
 * UC2: Print a Hardcoded Palindrome Result
 * Goal: Display whether a hardcoded string is a palindrome
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String literal)
        String word = "nitin";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check using conditional statement
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}