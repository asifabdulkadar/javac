import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();


		if (num == 0) {
			System.out.println("Number of digits: 1");
		} else {
			int count = 0;
			int temp = Math.abs(num);

			while (temp > 0) {
				temp /= 10;
				count++;
			}

			System.out.println("Number of digits: " + count);
		}
	}
}
