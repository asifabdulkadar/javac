public class automorphic {
    public static void main(String[] args){

        int a =6;
        if(a<0){
            a=-a;

        }
        int squareNum= a*a;
        int temp =a;
        int count = 0;
        while(temp>0){
            count++;
            temp=temp/10;

        }
        int lastDigit = squareNum%(int)Math.pow(10,count);
        if(lastDigit==a){
            System.out.println("Automorphic Number");

        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
}
