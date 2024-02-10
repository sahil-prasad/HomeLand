import java.util.Scanner;
public class Test2
{
    public static void main(String[] args)
    {
        Scanner name=new Scanner(System.in);
        System.out.println("Write your first name");
        String First_Name=name.nextLine();
        System.out.println("Write your last name");
        String Last_Name=name.nextLine();
        System.out.println("Your Full Name is:");
        System.out.println(First_Name+ Last_Name);
    }
}