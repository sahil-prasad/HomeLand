package FunctionsAndArray;

import java.util.Collection;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i <size ; i++) {
            number[i]= sc.nextInt();
        }
        // int arr = {2,5,3,-4,-1}
        for (int i = 0; i < size; i++) {
            if (number[i] > min){
                min = number[i];
            }
            if (number[i] < max){
                max = number[i];
            }

        }
        System.out.println("The largest value is "+ max);
        System.out.println("The Smallest Value is " + min);
    }
}
