import java.util.Scanner;
public class UpperCase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String x=sc.nextLine();
        String name=x.toUpperCase();

        System.out.println(name);
    }
}