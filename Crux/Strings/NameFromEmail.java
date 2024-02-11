package Strings;

import java.util.Scanner;

public class NameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.next();
        String username = "";
        for (int i = 0; i <mail.length() ; i++) {
            if (mail.charAt(i) == '@'){
                break;
            } else{
                username += mail.charAt(i);
            }
        }
        System.out.println(username);

    }
}
