import java.util.*;

public class FibonacciChecker {
    public static HashSet<Integer> generateFibonacci(int limit) {
        HashSet<Integer> fibSet = new HashSet<>();
        int a = 0, b = 1;
        while (a <= limit) {
            fibSet.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fibSet;
    }
    public static void checkFibonacciInRange(int start, int end) {
        HashSet<Integer> fibSet = generateFibonacci(end);
        for (int num = start; num <= end; num++) {
            if (fibSet.contains(num)) {
                System.out.println(num + " is a Fibonacci number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        checkFibonacciInRange(start, end);

        scanner.close();
    }
}
