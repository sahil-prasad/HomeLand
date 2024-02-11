import java.util.Scanner;
public class P2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("Enter the Elements one by one:");
        for(int i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(number[j]*2);
        }
    }
}