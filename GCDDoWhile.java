import java.util.Scanner;

public class GCDDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int gcd = 1, i = 1;

        do {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        } while (i <= Math.min(num1, num2));

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }
}
