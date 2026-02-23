public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        // Normalize: remove spaces & convert to lowercase
        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome (case-insensitive, space-ignored).");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome (case-insensitive, space-ignored).");
        }
    }

    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}