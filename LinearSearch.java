import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Prompt user to enter the element to search for
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        // Perform linear search
        int result = linearSearch(arr, target);
        
        // Display result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Element found, return the index
            }
        }
        return -1;  // Element not found
    }
}
