public class Main {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker Management System";
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message
        displayWelcomeMessage();

        // Program continues to next use case or exits
        System.out.println("System initialized successfully.");
    }

    // Displays the welcome message with application name and version
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the " + APP_NAME);
        System.out.println("Version : " + APP_VERSION);
    }
}