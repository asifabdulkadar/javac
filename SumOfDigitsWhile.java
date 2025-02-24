import java.util.Scanner;

public class SumOfDigitsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
