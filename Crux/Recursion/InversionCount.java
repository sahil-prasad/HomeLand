package Recursion;

public class InversionCount {
    public static void main(String[] args) {
        int [] arr = {8,4,2,1};
        int n = arr.length;
        divide(arr,0,n-1);
    }
    public static void divide(int [] arr, int si, int en){
        if (si >= en) {
            return;
        }
        int mid = si + (en - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, en);
        conquer( arr,  si,  mid,  en);
    }
    public static void conquer(int[] arr, int si, int mid, int en){
        int []merge = new int[en = si +1];
        int count = 0;
        int indx1 = si;
        int indx2 = mid+1;
        int k = 0;


        while(indx1<= mid && indx2<=en){
            if(arr[indx1]>arr[indx2]){
                count++;
            }

        }
        System.out.println(count);
    }

}
