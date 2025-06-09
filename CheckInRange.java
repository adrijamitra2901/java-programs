import java.util.Scanner;

public class CheckInRange {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input two integers M and N
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Define the range
        int min = 1;
        int max = 100;

        // Check if both M and N are within the range [min, max]
        if (M >= min && M <= max && N >= min && N <= max) {
            System.out.println("Both M and N are within the range of " + min + " to " + max);
        } else {
            System.out.println("At least one of M or N is outside the range of " + min + " to " + max);
        }
    }
}
