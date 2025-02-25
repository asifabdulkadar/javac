import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sumEven = 0, sumOdd = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
        }

        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
    }
}
