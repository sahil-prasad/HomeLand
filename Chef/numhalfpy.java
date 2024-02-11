import java.util.Scanner;
public class numhalfpy
{
    public static void main(String[]args)
    {
        System.out.println("Enter the order");
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        for(int i=1;i<=o;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }System.out.println(" ");
        }
    }
}
