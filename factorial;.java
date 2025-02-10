// factorial number 
    
    public class factorial{
        public static int factorial(int n){
            if(n==0){   // base case 
                return 1;
            }
            return n *factorial(n-1); // recursive 
        }
        
        public static void main(String[] args){
            int number = 5;
            System.out.println("Factorial of 5 :" + factorial(number));
        }
        
    }
