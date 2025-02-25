import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        int choice;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Deposit successful! New Balance: $" + balance);
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                int withdraw = scanner.nextInt();
                if (withdraw > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful! New Balance: $" + balance);
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using our ATM!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
