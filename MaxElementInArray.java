import java.util.*;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum element
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output the maximum element
        System.out.println("The maximum element is: " + max);

        scanner.close();
    }
}
