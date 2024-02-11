import java.util.Scanner;
public class menu
{
    public static void main(String[]args)
    {   int marks;
        System.out.println("Enter 1 to Proceed");
        System.out.println("Enter 0 to Stop");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("Enter your marks:");
            marks=sc.nextInt();
            if(marks>=90)
            {
                System.out.println("This is Good");

            }
            else if(marks>=60 && marks <=89)
            {
                System.out.println("This is also Good");
            }
            else
            {
                System.out.println("This is Good as well");
            }
            break;
            case 0:
            System.out.println("Your session has been terminated , Thanks");

        }
    }
}