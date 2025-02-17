import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Letter.");
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }
    }
}
