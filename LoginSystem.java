import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Predefined username and password (you can change these as needed)
        String correctUsername = "adrija";
        String correctPassword = "password090625";
        
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Ask for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the entered username and password are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}
