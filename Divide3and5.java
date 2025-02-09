import java.util.*;
public class Divide3and5
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0 && n%5==0 ) {
			System.out.print("divisible by both ");
		}
		else if(n%3==0) {
			System.out.print("it's divisible by 3");
		}
		else if(n%5==0) {
			System.out.print("it's divisible by 5");
		}
		else {
			System.out.print("not divisible by both");
		}
	}
}
