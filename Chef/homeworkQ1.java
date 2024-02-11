import java.util.Scanner;
public class homeworkQ1
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
         if(n%i > 1)
         {
            System.out.println(" A Prime Numeber");
            break;
         }
         else
         {
            System.out.println("Not A Prime Number");
         }
        }
    }
}