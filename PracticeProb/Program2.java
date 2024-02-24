import java.util.Scanner;
class One
{
    static void Display(int a)
    {
        
        if(a>=0 && a<=9)
        { 
        System.out.println("Single digit");
        }
        else
        System.out.println("Double Digit");
    }

}
public class Program2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        int p=sc.nextInt();
        
        One.Display(p);
    }
}