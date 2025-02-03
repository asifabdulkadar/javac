import java.util.Scanner;

public class DoctorEarnings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalIncome = 0, count = 0;

        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) break;

            try {
                int age = Integer.parseInt(input);
                if (age <= 0 || age > 120 || count >= 20) {
                    System.out.println("INVALID INPUT");
                    return;
                }
                count++;

                totalIncome += (age < 17) ? 200 : (age <= 40) ? 400 : 300;
            } catch (Exception e) {
                System.out.println("INVALID INPUT");
                return;
            }
        }

        System.out.println("Total Income " + totalIncome + " INR");
        sc.close();
    }
}
