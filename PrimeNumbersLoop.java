import java.util.Scanner;

public class PrimeNumbersLoop {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println("Prime numbers in the range:");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) System.out.print(num + " ");
        }
    }
}
