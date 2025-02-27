import java.util.Scanner;

public class LargestPrimeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        int largestPrime = -1;
        
        int i = start;
        do {
            boolean isPrime = true;
            int j = 2;

            if (i < 2) {
                isPrime = false;
            } else {
                do {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    j++;
                } while (j <= Math.sqrt(i));
            }

            if (isPrime) {
                largestPrime = i;
            }

            i++;
        } while (i <= end);

        if (largestPrime != -1)
            System.out.println("Largest prime number in range: " + largestPrime);
        else
            System.out.println("No prime numbers found in the given range.");
            
        sc.close();
    }
}
