package FunctionsAndArray;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int target = 3;
        // int = [5,6,7,0,1,2,3,4]
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;

        }
    }
}
