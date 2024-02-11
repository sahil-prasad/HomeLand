package FunctionsAndArray;

import java.util.Scanner;

public class evenNumber {
    public static void even(int a) {
        if(a%2 ==0){
            System.out.println(" even number");
        } else{
            System.out.println("Odd number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        even(a);
    }
}
