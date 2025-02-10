public class armstrongNumber {
    public static void main(String[] args) {
        int a=246700;
        int rem=0;
        int sum=0;
        int temp=a;

        while(a>0){
            rem=a%10;
            int cube=rem;
            cube=cube*cube*cube;
            int digits= String.valueOf(a).length();
            sum=sum+cube;
            a=a/10;
            sum+=(int) Math.pow(digits,digits);
            a/=10;
        }
        if (sum==temp){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
