package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        int n =1;
        printnum(n);
    }
    public static void printnum(int n){
        if( n == 6){
            return;
        }
        System.out.print(n + " ");
        printnum(n+1);
    }
}
