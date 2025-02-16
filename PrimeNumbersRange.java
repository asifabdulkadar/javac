import java.util.Scanner;

public class PrimeNumbersRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter start of range: ");
		int start = scanner.nextInt();
		System.out.print("Enter end of range: ");
		int end = scanner.nextInt();
		scanner.close();

		System.out.println("Prime numbers in the range:");
		for (int num = start; num <= end; num++) {
			if (num > 1) {
				boolean isPrime = true;
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.print(num + " ");
				}
			}
		}
	}
}
