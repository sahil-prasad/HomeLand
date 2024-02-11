package Recursion;

public class SayDigit {
    public static void main(String[] args) {
        String []arr = {"Zero","one","Two","three","Four","Five","Six","Seven","Eight","Nine"};

        saydigit(412,arr);
    }
    public static void saydigit(int n,String arr[]){
        if(n==0){
            return;
        }

        int digit = n%10;
        n = n/10;

        saydigit(n,arr);
        System.out.print(arr[digit] + " ");
    }
}
