import java.util.Scanner;
public class BasicLoop{
    public static void main(String[]args){
        int[] marks = new int[3];
        marks[0]=97;//physics
        marks[1]=98;//chemistry
        marks[2]=95;//english
        
        for(int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }
    }
}