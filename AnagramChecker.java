import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word2 = sc.nextLine();
		char[] chars = word.toLowerCase().toCharArray();
		char[] chars2 = word2.toLowerCase().toCharArray();
		Arrays.sort(chars);
		Arrays.sort(chars2);
		if (Arrays.equals(chars,chars2)) {
			System.out.println("YES, it's anagram");
		}
		else {
			System.out.println("NO, it's not anagram");
		}
	}
}
