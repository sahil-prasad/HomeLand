import java.util.Scanner;
public class halfpyramiderror
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and number of columns");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        for(int i=1;i<=rows;i++)
        
        {
            for(int j=1;j<=columns;j++)
            if(i>=j)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println( );
    }
    
}