import java.util.*;
public class oddOrEven
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.print("it's Even");
		}
		// else if(n==0){
		//     System.out.print("Zero");
		// }
		else {
			System.out.print("It's odd");
		}
	}
}
