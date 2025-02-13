import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first angle: ");
		int angle1 = sc.nextInt();
		System.out.print("Enter second angle: ");
		int angle2 = sc.nextInt();
		System.out.print("Enter third angle: ");
		int angle3 = sc.nextInt();
		if (angle1 + angle2 + angle3 == 180) {
			if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
				System.out.println("The triangle is an Obtuse Triangle.");
			} else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("The triangle is a Right Triangle.");
			} else {
				System.out.println("The triangle is an Acute Triangle.");
			}
		}
		else {
			System.out.println("Not a Valid Triangle.");
		}


	}
}
