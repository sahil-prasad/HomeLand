import java.util.Scanner;
class One
{
    static void Sum(int n)
    {
        if(n!=0)
        {
        
        for(int i=1;i<n;i++)
        {
        int arr[]=new int[n];
        int sum=+n;
        System.out.println(sum);
        }
        
        }
        else
        {
            System.out.println("Terminated");
        }
        
}
}
public class Program8
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      One.Sum(n);  
    }
}
