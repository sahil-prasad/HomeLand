package Recursion;

public class SelectionSorting {
    public static void main(String[] args) {
        int [] arr = {1,7,5,3,2};
        int n = arr.length;
        sort(arr,n);
        printarray(arr);
    }
    public static void sort(int arr[],int n){
        if(n == 0 || n == 1 ){
            return;
        }

        for (int i = 0; i <n-1 ; i++) {
            int min = i;
            if(arr[i] > arr[i+1]){
                min = i+1;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        sort(arr,n-1);
    }
    public static void printarray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
