import java.util.Scanner;
public class TakingInput
{
    public static void main(String[] args)
    {
        System.out.println("Taking Input from User");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        float a=sc.nextFloat();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        float sum=a+b;
        System.out.println("The Sum is :"+sum);
    }
}