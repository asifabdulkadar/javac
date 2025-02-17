import java.util.Scanner;

public class CreditCardValidator {
    public static boolean isValidCreditCard(long number) {
        int sum = 0;
        boolean alternate = false;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i--) {
            int digit = numStr.charAt(i) - '0';
            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            alternate = !alternate;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        long cardNumber = scanner.nextLong();
        scanner.close();

        if (isValidCreditCard(cardNumber)) {
            System.out.println("Valid Credit Card Number.");
        } else {
            System.out.println("Invalid Credit Card Number.");
        }
    }
}
