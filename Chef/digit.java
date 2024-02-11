import java.util.Scanner;
public class digit
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        float a=sc.nextFloat();
        if(a>0 && a<10)
        System.out.println("You Entered a Single Digit number");
        else if(a>9 && a<100)
        System.out.println("You Entered two digit number ");
        else
        System.out.println("Be In Your Limits");

    }
}