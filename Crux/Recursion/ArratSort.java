package Recursion;

public class ArratSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,5};
        int size = arr.length;
        boolean ans = arraysorted(arr,size);
        if(ans ){
            System.out.println("Array is sorted");
        } else{
            System.out.println("Array is unsorted");
        }

    }
    public  static boolean arraysorted(int [] arr, int size ){
        if(size == 0 || size == 1){
            return true;
        }
        if(arr[size-2] > arr[size -1]){
            return false;
        } else {
            boolean remianingpart = arraysorted(arr,size-1);
            return remianingpart;
        }
    }
}
