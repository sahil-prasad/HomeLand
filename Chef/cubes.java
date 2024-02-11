import java.util.Scanner;
public class cubes
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        float a=sc.nextFloat();
        System.out.println("Enter the Second Number:");
        float b=sc.nextFloat();
        System.out.println("Enter the Third Number:");
        float c=sc.nextFloat();
        float sum=(a*a*a)+(b*b*b)+(c*c*c);
        System.out.println("The Product of the sum of two numbers is: "+sum);
    }
}