package Exercise1;

import java.util.Scanner;

public class Average {
    public static float Average(int a, int b , int c){
        int ans = (a+b+c)/3;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println("Average is " + Average(a,b,c));

    }
}
