import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
