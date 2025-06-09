import java.util.Scanner;

public class SumTwoIntegers {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input two integers M and N
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate and print the sum
        int sum = M + N;
        System.out.println("The sum of M and N is: " + sum);
    }
}
