import java.util.Scanner;
public class patternp
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        System.out.println("Enter the number of columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)       //outer loop
        {
            for(int j=1;j<=c;j++)       //inner loop
            {
                System.out.print("*");
            }
            
        System.out.println();
        }

    }
}