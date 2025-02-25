import java.util.Scanner;

public class LargestPrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();
        scanner.close();

        int largestPrime = -1;
        for (int num = upper; num >= lower; num--) {
            if (isPrime(num)) {
                largestPrime = num;
                break;
            }
        }

        if (largestPrime != -1) {
            System.out.println("Largest prime number in the range: " + largestPrime);
        } else {
            System.out.println("No prime numbers found in the range.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
