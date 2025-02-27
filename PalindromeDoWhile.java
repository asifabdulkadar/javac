import java.util.Scanner;

public class PalindromeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = str.length();
        int i = 0;
        boolean isPalindrome = true;

        do {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
            i++;
        } while (i < length / 2);

        if (isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
            
    }
}
