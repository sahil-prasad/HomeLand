import java.util.Scanner;
class Display
{
    static void Display(int a)
    {
        switch(a)
        {
            case 1:
            {
                System.out.println("Good");
                break;
            }
            case 2:
            {
                System.out.println("better");
                break;
            }
            case 3:
            {
                System.out.println("Best");
                break;
            }
            default:
            {
                System.out.println("Invalid");
                break;
            }
        }
    }
}
public class Exercise1P1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The digit"); 
        int a=sc.nextInt();
        Display d1=new Display();
        d1.Display(a);
    }
}