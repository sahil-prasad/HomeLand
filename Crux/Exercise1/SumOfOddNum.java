package Exercise1;

import java.util.Scanner;

public class SumOfOddNum {
    public static void OddSum(int n) {
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                sum = sum + j;


            }
        }
        System.out.println("The Sum of 1 to "+ n+" Odd Numbers is "+sum);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OddSum(n);
    }
}
