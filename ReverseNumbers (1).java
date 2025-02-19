import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        switch (1) {
            case 1:
                for (int i = n; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
        }
        
    }
}
