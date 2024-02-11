package Recursion;

public class Power {
    public static void main(String[] args) {
        int ans = clacpower(2,3);
        System.out.println(ans);
    }
    public static int clacpower(int x, int n){
        if(x == 0){
            return 0;
        } else if(n == 0){
            return 1;
        }

        return x*clacpower(x,n-1);
    }
}
