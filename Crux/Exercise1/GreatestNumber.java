package Exercise1;

import java.util.Scanner;

public class GreatestNumber {
    public static void Greatest(int a, int b){
        if( a>b){
            System.out.println(a + " is greatest");
        } else if (b>a) {
            System.out.println(b + " is greatest");
        } else {System.out.println("Both are equal");}
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Greatest(a,b);
    }
}
