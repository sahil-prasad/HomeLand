import java.util.Scanner;
public class halfpy
{
    public static void main(String[]args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                 System.out.print("* ");
            }
           System.out.println();
        }
    }
}