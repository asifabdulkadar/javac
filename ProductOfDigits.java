import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int product = 1;
        while (num > 0) {
            product *= num % 10; // Extract last digit and multiply
            num /= 10;           // Remove last digit
        }

        System.out.println("Product of digits: " + product);
    }
}