import java.util.Scanner;

public class TicketReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.println("\nAvailable seats: ");
            for (int i = 0; i < seats.length; i++)
                System.out.print((seats[i] ? "[X]" : "[" + (i + 1) + "]") + " ");
            System.out.println("\n1. Book Ticket\n2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            System.out.print("Enter seat number (1-10): ");
            int seatNum = sc.nextInt();

            if (seatNum < 1 || seatNum > 10 || seats[seatNum - 1])
                System.out.println("Invalid or already booked seat!");
            else {
                seats[seatNum - 1] = true;
                System.out.println("Seat " + seatNum + " booked successfully.");
            }
        }
        sc.close();
    }
}
