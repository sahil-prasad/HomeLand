import java.util.Scanner;
public class cases
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age between 1 and 5");
        int age=sc.nextInt();
        switch(age)
        {
            case 1:
            System.out.println("You are 1 year Old");
            break;
            case 2:
            System.out.println("You are 2 years old");
            break;
            case 3:
            System.out.println("You are 3 years old");
            break;
            case 4:
            System.out.println("You are 4 years old");
           break;
            case 5:
            System.out.println("You are 5 years old");
            break;
            default:
            System.out.println("be in your limits");

        }
    }
}