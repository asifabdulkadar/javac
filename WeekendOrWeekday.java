import java.util.Scanner;

public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = sc.nextLine().toLowerCase();
       

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println(day + " is a Weekend.");
        } else {
            if (day.equals("monday") || day.equals("tuesday") || 
                day.equals("wednesday") || day.equals("thursday") || 
                day.equals("friday")) {
                System.out.println(day + " is a Weekday.");
            } else {
                System.out.println("Invalid input! Please enter a valid day.");
            }
        }
    }
}
