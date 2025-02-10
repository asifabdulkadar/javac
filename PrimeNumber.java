import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		} else {
			int i = 2;
			while (i * i <= n) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
		}

		if (isPrime) {
			System.out.println(n + " is a Prime number.");
		} else {
			System.out.println(n + " is not a Prime number.");
		}
		
	}
}
