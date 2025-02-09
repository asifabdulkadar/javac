import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), original = n, sum = 0, count = 0;

        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1, i = 0;
            while (i < count) {
                power *= digit;
                i++;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        sc.close();
    }
}
