import java.util.Scanner;

/**
 * Abstract class - Abstraction
 * Defines the blueprint for any type of bank account
 */
abstract class Account {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    // Constructor to initialize account
    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method for interest calculation - must be implemented by child
    public abstract void calculateInterest();

    // Display account details
    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

/**
 * SavingsAccount class - Inherits from Account (Inheritance)
 * Uses encapsulation for balance management and overrides method (Polymorphism)
 */
class SavingsAccount extends Account {
    private final double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    // Deposit money - Encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money - Encapsulation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    // Calculate interest - Polymorphism (method overriding)
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest earned at 4%: ₹" + interest);
    }
}

/**
 * Main class - Demonstrates Class, Object, and uses all OOP concepts
 */
public class OOPSBankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank account object (Class & Object)
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount(name, accNumber, initialBalance);

        int choice;
        do {
            // Menu for user interaction
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Display Account Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch case to handle options
            switch (choice) {
                case 1:
                    account.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 4:
                    account.calculateInterest();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
