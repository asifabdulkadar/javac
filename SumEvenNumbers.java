import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        int sum = 0;  
        int i = 2;    
        do {
            sum += i; 
            i += 2;   
        } while (i <= N);

        System.out.println("Sum of even numbers up to " + N + " is: " + sum);
        
        scanner.close();
    }
}
