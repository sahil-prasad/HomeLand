package Recursion;

public class StringRev {
    public static void main(String[] args) {
        char []name = "babbar".toCharArray();
        int n = name.length;

        reverse(name,0,n);

    }
    public static void reverse( char []name , int index, int n){

        if(index == n){
            return;
        }
        char temp = name[index];
        reverse(name,index+1,n);
        System.out.print(temp);

    }
}
