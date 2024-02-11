package Exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to Continue '0' to stop");
        int num = sc.nextInt();
        int positive =1, Negative =0, Zero =0;
        while (num ==1){
            System.out.println("Enter Your Number");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            } if(number<0){
                Negative++;
            } if(number ==0){
                Zero++;
            }
            System.out.println("Press '1' to Continue '0' to stop");
            num = sc.nextInt();
        }
        System.out.println("Number of Positive numbers enters are:" + positive);
        System.out.println("Number of Negative numbers enters are:" + Negative);
        System.out.println("Number of Zeros enters are:" + Zero);
    }
}
