import java.util.Scanner;
public class square_star
{
    public static void main(String[]args)
{
    int r,c;
    System.out.println("Enter Rows & Columns");
    Scanner sc=new Scanner(System.in);
    r=sc.nextInt();
    c=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        System.out.print("* ");
        System.out.println(" ");
    }
}
}