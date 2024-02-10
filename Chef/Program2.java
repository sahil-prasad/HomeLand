import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number b/w 1 and 100");
        int num=sc.nextInt();
        if(num>0 && num<10)
        System.out.println("The number is single digit number");
        else
        System.out.println("The number is double digit number");
    }
}