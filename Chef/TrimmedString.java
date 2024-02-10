import java.util.Scanner;
public class TrimmedString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String x=sc.nextLine();
        String name=x.trim();
        System.out.println(name);
        
    }
}