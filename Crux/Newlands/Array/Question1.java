//TAKE AN ARRAY AS INPUT FROM THE USER.SEARCH FOR A GIVEN NUMBER x AND PRINT THE INDEX AT WHICH IT OCCURS
import java.util.Scanner;
public class Question1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();//Storing
        }
        int x=sc.nextInt();// x to be searched is stored here

        for(int i=0;i<number.length;i++){
            if(number[i]== x){
                System.out.println("x found at index:"+ i);
            }
            
        }
    }
}