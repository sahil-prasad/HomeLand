import java.util.Scanner;
public class Name
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        
        System.out.print("Hello "+name);
        System.out.print(" have a good day");
    }
}