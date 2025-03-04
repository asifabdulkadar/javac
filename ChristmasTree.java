import java.util.Scanner;

public class ChristmasTree {
    public static void printTree(int n) {
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 3; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n / 2) - 1; j++) System.out.print(" ");
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the tree: ");
        int n = sc.nextInt();
        if (n % 2 == 0) n++; // Ensure odd height for symmetry
        printTree(n);
        sc.close();
    }
}
