import java.util.Scanner;
public class Program4
{ 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total Classes held?");
        int classes=sc.nextInt();
        System.out.println("Total classes attended?");
        int attended=sc.nextInt();
        double percent=(attended/classes)*100;
        
        if(percent<=75 )
        System.out.println("Low attendance!Not eligible to take Exam");
        else if(percent>75)
        System.out.println("Eligible to take Exam");
        
    }
}    