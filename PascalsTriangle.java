import java.util.Scanner;

public class PascalsTriangle {
    public static void printPascalsTriangle(int n) {
        for (int line = 0; line < n; line++) {
            int num = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printPascalsTriangle(n);
        sc.close();
    }
}
