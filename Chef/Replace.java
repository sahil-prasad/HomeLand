import java.util.Scanner;
public class Replace
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String x=sc.nextLine();
        String name=x.replace('r','p');
        System.out.println(name);
        
    }
}
