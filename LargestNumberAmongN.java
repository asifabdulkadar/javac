import java.util.*;

public class LargestNumberAmongN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of numbers: ");
		int n = sc.nextInt();


		// if (n <= 0) {
		//     System.out.println("Invalid input. Enter a number greater than zero.");
		// }
		if(n>=1) {
			int max = sc.nextInt();
			for (int i = 2; i <= n; i++) {
				int num = sc.nextInt();
				if (num > max) {
					max = num;
				}
			}

			System.out.println("The largest number is: " + max);
		}

	}
}
