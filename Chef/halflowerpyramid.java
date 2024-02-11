import java.util.Scanner;
public class halflowerpyramid
{
    public static void main(String[]args)
    {
        System.out.println("Enter the order");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c;
        c=r;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i>=j)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print(" ");
                    System.out.println();
                }
            }
        }

    }
}