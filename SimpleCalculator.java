
import java.util.*;

public class SimpleCalculator
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		System.out.println("enter a symbol: ");
		char ch = in.next().charAt(0);//*
		switch(ch) {
		case '+':
			System.out.print(a+b);
			break;
		case'-':
			System.out.print(a-b);
			break;
		case'*' :
			System.out.print(a*b);
			break;
		case '/':
			System.out.print(a/b);
			break;
		case '%':
			System.out.print(a%b);
			break;

		}

	}
}
