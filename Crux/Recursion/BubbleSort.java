package Recursion;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr ={1,7,4,5,3};
        int n = arr.length;
         sort(arr,n);
      //  System.out.println(ans);
        printarray(arr);

    }
    static void sort(int [] arr, int n){
        // base case
        if(n==1 || n==0) {
            return;}
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
         sort(arr,n-1);

    }
    public  static void printarray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
