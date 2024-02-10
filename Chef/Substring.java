import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String x=sc.nextLine();
        String name=x.substring(2,4);
        System.out.println(name);
        
    }
}