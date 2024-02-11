package Recursion;

public class Factorial {
    public static void main(String[] args) {
        factorial(1,5,1);

    }
    public static void factorial(int i,int n, int factorial ){
        if(i==n+1){
            System.out.println(factorial);
            return;
        }
        factorial *= i;
        factorial(i+1,n,factorial);
    }
}
