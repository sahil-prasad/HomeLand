package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int size = arr.length;
        int key = 3;
        boolean ans = search(arr,size,key);
        if(ans){
            System.out.println("3 is present");
        } else{
            System.out.println("Not present");
        }
    }
    public static boolean search(int [] arr , int size,int key){
        if(size == 0){
            return false;
        }

        if(arr[size-1] == key){
            return true;
        } else{
           boolean  remaingpart  =  search(arr,size-1,key);
           return  remaingpart;
        }
    }
}
