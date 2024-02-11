package Recursion;

public class factorial2 {
    public static void main(String[] args) {
factorial(5);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
           return  1;
        }
        int Factorial = factorial(n-1);
        int fact =  Factorial*n;
        return fact;
        
    }
}
