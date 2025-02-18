import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Greet");
        System.out.println("2. Show Date");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello! Have a great day!");
                break;
            case 2:
                System.out.println("Today's date is " + java.time.LocalDate.now());
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
