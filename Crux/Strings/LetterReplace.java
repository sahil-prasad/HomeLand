package Strings;

import java.util.Scanner;

public class LetterReplace {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String Word = sc.nextLine();
        String result = "";
        for (int i = 0; i < Word.length() ; i++) {
            if (Word.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += Word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
