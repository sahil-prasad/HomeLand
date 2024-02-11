package Recursion;

public class power2 {
    public static void main(String[] args) {
        int a = 2;
        int b =3;

       int ans =  power(a,b);
        System.out.println(ans);

    }
    public  static int power(int a , int b){
        if(b == 0){
            return 1;
        } if(b == 1){
            return a;
        }
        // Recursion
        int ans = power(a,b/2);
        if(b%2 == 0){
            return ans*ans;
        } else{
            return a*ans*ans;
        }

    }
}
