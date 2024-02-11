package Recursion;

public class Sum {
    public static void main(String[] args) {
printsum(1,3,0);
    }
    public static void printsum(int i, int n,int  sum){
        if(i == n+1){
           // sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i+1,n,sum);
    }
}
