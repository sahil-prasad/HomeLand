package Extra;

public class Squarroot {
    public static void main(String[] args) {
        int n =36;
        root(n);
    }
    static void root(int n){

           for (int  i = 1; i < n ; i++) {
               if(i*i == n) {
                   System.out.print(i);
               }

       }
    }
}
