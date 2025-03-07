import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Coke - $2\n2. Pepsi - $3\n3. Water - $1\nChoose an option:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("You bought a Coke for $2.");
            case 2 -> System.out.println("You bought a Pepsi for $3.");
            case 3 -> System.out.println("You bought Water for $1.");
            default -> System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
