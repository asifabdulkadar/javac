import java.util.Scanner;

public class SumOfSquaresDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        
        int sumOfSquares = 0;
        int i = start;

        do {
            sumOfSquares += i * i;
            i++;
        } while (i <= end);

        System.out.println("Sum of squares from " + start + " to " + end + " is: " + sumOfSquares);
        
    }
}
