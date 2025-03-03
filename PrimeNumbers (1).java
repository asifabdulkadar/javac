import java.util.Scanner;

public class PrimeNumbers {
    public static void printPrimes(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        printPrimes(start, end);
        sc.close();
    }
}


