public class UseCase1PalindromeCheckerApp {

    // Application Constants
        private static final String APPLICATION_NAME = "Palindrome Checker App";
        private static final String APPLICATION_VERSION = "Version 1.0";

        /*
         * Main Method
         * Entry point of the Java application
         * JVM invokes this method automatically
         */
        public static void main(String[] args) {

            displayWelcomeMessage();

            // Flow continues to next use case (placeholder)
            System.out.println("Application initialized successfully.");
        }

        /*
         * Static method to display welcome message
         * Demonstrates use of static keyword and console output
         */
        private static void displayWelcomeMessage() {

            System.out.println("========================================");
            System.out.println("Welcome to " + APPLICATION_NAME);
            System.out.println("Application Version: " + APPLICATION_VERSION);
            System.out.println("========================================");
        }
    }
}
