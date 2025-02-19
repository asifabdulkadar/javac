import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit: " + ((celsius * 9/5) + 32));
                break;
            case 2:
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.println("Celsius: " + ((fahrenheit - 32) * 5/9));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
