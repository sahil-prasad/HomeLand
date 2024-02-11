package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StringBuilder reversed  = new StringBuilder(name);
        reversed.reverse();
        System.out.println("Reverse string is " + reversed.toString());


    }
}
