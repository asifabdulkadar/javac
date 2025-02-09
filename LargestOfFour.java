import java.util.Scanner;

public class LargestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }

        System.out.println("Largest number is: " + largest);
        sc.close();
    }
}
