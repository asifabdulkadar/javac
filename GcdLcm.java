import java.util.*;

public class GcdLcm {  
    
    
    public static int findGcd(int a, int b) { // Made it static
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLcm(int a, int b) { 
        return (a * b) / findGcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        int gcd = findGcd(a, b);
        int lcm = findLcm(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        sc.close();
    }
}
