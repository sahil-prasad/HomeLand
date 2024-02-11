package Recursion;

public class test {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int si, int en) {
        if (si >= en) {
            return;
        }
        int mid = si + (en - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, en);
        conquer(arr, si, mid, en);
    }

    public static void conquer(int[] arr, int si, int mid, int en) {
        int[] merged = new int[en - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= en) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }
        }

        while (indx1 <= mid) {
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }

        while (indx2 <= en) {
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }

        // Copy the merged array back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }
}

