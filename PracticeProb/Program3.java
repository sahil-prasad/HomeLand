import java.util.Scanner;
class One
{
    static void Display(int a)
    {
        if(a>=0 && a<=9)
        {
            System.out.println("Single Digit");
        }
        else if (a>=10 && a<=99) 
        {
            System.out.println("Double Digit");
        }
        else
        {
            System.out.println("You Entered Number Beyond Asked Range");
        }
    }
}
public class Program3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        One.Display(p);
    }
}