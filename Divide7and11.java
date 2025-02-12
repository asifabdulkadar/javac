import java.util.*;
public class Divide7and11
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0  ) {
			System.out.println("divisible by 7 ");
		}
		if(n%11==0) {
			System.out.println("it's divisible by 11");
		}
// 		else if(n%5==0) {
// 			System.out.print("it's divisible by 5");
// 		}
		else {
			System.out.print("not divisible by both");
		}
	}
}