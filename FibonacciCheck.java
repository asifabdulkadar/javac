import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), a = 0, b = 1, c = 0;

        if (n == 0 || n == 1) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            while (c < n) {
                c = a + b;
                a = b;
                b = c;
            }
            if (c == n) {
                System.out.println(n + " is a Fibonacci number.");
            } else {
                System.out.println(n + " is not a Fibonacci number.");
            }
        }
        sc.close();
    }
}
