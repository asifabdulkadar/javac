import java.util.Scanner;

public class DateValidator {
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1) return false;

        if (month < 1 || month > 12) return false;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2) {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeap) daysInMonth[2] = 29;
        }

        return day >= 1 && day <= daysInMonth[month];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isValidDate(day, month, year)) {
            System.out.println("Valid Date.");
        } else {
            System.out.println("Invalid Date.");
        }
    }
}
