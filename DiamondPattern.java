import java.util.Scanner;

public class DiamondPattern {
    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for diamond size: ");
        int n = sc.nextInt();
        if (n % 2 == 0) n++; 
        printDiamond(n);
    }
}