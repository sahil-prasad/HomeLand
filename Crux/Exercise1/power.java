package Exercise1;

import java.util.Scanner;

public class power {
    public static void Power(int x, int n){
        int result =1;
        for (int  i = 1; i <=n ; i++) {
            result = result*x;
        }
        System.out.println(result);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Power(x,n);
    }
}
