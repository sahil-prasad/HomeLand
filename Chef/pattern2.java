import java.util.Scanner;
public class pattern2
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
                if(i==1 || j==1 || i==r || j==c)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
                
            }
            
        System.out.println();
        }

    }
}