import java.util.Scanner;
public class Program3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number b/w 1 and 100");
        int num=sc.nextInt();
        
        if(num>0 && num<10)
        System.out.println("The number is Single digit");
        
        else if(num>=10 && num<100)
        System.out.println("The number is Double digit number");
        
        else 
        System.out.println("Kindly enter number between 1 and 100");
        
    }
}