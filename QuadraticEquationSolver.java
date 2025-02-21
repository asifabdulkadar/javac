import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = (b * b) - (4 * a * c);
        int dCase = (discriminant > 0) ? 1 : (discriminant == 0) ? 0 : -1;

        switch (dCase) {
            case 1:
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two distinct real roots: " + root1 + " and " + root2);
                break;
            case 0:
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
                break;
            case -1:
                System.out.println("No real roots, roots are complex.");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
