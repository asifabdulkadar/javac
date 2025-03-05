import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (char ch : charCountMap.keySet()) {
            System.out.println(ch + " : " + charCountMap.get(ch));
        }
        sc.close();
    }
}
