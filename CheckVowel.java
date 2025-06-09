import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input character
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);  // Convert input to lowercase

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }
}
