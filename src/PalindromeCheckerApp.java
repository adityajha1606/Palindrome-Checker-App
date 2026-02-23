/*
 * Palindrome Checker App
 * UC3: Palindrome Check Using String Reverse
 * Goal: Check whether a string is a palindrome by reversing it.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string (String literal)
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}