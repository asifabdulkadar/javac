import java.util.*;
public class posOrZeroOrNeg
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.print("it's positive integer");
		}
		else if(n<0) {
			System.out.print("it's Negative integer");
		}
		else {
			System.out.print("It's Zero integer");
		}
	}
}