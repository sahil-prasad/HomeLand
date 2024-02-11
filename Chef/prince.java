import java.util.Scanner;
public class prince
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=5;
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum"+sum);

    }
}