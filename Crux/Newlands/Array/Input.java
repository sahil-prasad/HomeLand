import java.util.Scanner;
public class Input{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}

//input=6
/*Result :  0                 int-0;float-0.0;boolean-false;string-" "
            0
            0  
            0
            0
            0*/