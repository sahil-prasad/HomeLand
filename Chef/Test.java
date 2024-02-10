import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
    Scanner name=new Scanner(System.in);
    System.out.println("Write first number");
    int Num1=name.nextInt();
    System.out.println("Write Second Number");
    int Num2=name.nextInt();
    int Num3=Num1+Num2;
    System.out.println("The Sum is:"+Num3);
    }
}
