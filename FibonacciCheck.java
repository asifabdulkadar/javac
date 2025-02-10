import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n==0||n==1){
            System.out.println(0);
        }
        else{
            for(int i=1;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.println(c);
            }

        }
        if(n==c){
            System.out.println("its fibonacci number");
        }
        else{
            System.out.println("its not fibonacci number");
        }

    }
}
