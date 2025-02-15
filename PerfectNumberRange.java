import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers in the range " + start + " to " + end + " are:");

        for (int num = start; num <= end; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
            } else {
                if (sum < num) {
                } else {
                }
            }
        }
    }
}
