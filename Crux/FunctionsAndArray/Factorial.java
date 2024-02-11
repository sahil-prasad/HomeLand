package FunctionsAndArray;

import java.util.Scanner;

public class Factorial {
    public static void Factorial(int a){
        if(a<0){
            System.out.println("Invalid Input");
            return;
        }
        int factorial =1;
        for (int i = 1; i <=a ; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        Factorial(a);

    }
}
