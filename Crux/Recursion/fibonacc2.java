package Recursion;

public class fibonacc2 {
    public static void main(String[] args) {
        int n = 3;
        int result = fibonnaci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
    public static int fibonnaci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        int ans = fibonnaci(n-1) + fibonnaci(n-2);
        return ans;
    }
}
