package BitManupulation;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
       decimaltobinary(n);
        
    }
    public static void decimaltobinary(int n){
        if(n == 0){
            System.out.println("0");
            return;
        }

        StringBuilder binary  = new StringBuilder();
      while (n>0){
          int bit = n%2;
          binary.insert(0,bit);
          n = n/2;
      }
        System.out.println("Binary equaivalent " + binary.toString());
    }
}
