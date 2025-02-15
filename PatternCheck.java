import java.util.Scanner;

public class PatternCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if (str.length() >= 4 && str.startsWith("AI") && str.endsWith("DS")) {
			System.out.println("The string follows the pattern.");
		} else {
			System.out.println("The string does NOT follow the pattern.");
		}
	}
}
