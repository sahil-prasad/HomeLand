import java.util.Scanner;
public class rotatedhalfpy
{
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the order");
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=n-1;j++)
      {
         System.out.print(" ");
      }
      for(int k=1;k<=i;k++)
      {
         System.out.print(" *");
      }System.out.println();
   }
   } 
}