package Sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int []arr = {7,8,3,1,2};
        //selection sort
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
            if (arr[min]>arr[j]){
                  min = j;
                  }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
    public static void printarray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
