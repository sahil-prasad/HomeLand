package Recursion;

public class SuminArray {
    public static void main(String[] args) {
        int [] arr = {3,2,5,1,6};
        int size = arr.length;
        int ANS = sum(arr,size);
        System.out.println("Sum  is " + ANS);
    }
    public static int sum(int []arr,int size){
        if(size ==1){
            return arr[0];
        }

        int ans = arr[size-1] + sum(arr,size-1);
        return ans;
    }
}
