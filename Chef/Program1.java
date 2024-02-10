import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number");
        int Num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int Num2=sc.nextInt();
        System.out.println("Enter Third number");
        int Num3=sc.nextInt();
        int sum=Num1*Num1*Num1+Num2*Num2*Num2+Num3*Num3*Num3;
        
        System.out.println("The Sum of the cubes of the three numbers are:"+sum);
        
    }
}