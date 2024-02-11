package FunctionsAndArray;

import java.util.ArrayList;
import java.util.Scanner;

public class AsendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i <size ; i++) {
            number[i] = sc.nextInt();
        }
        int a = 1;
        int b = 1;
        boolean tf = false;
        for (int i = 0; i < size; i++) {
            if(number[a] < number[b]){
                tf = true;
            }else if (number[ a ] == number[b] ){
                tf = true;
                int j = 90;
            }else {
                tf = false;

                break;
            }
            a++;
            b++;
        }
        System.out.println(tf);


    }
}
