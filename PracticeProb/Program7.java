import java.util.Scanner;
class One
{
    static void sumCubes(int a,int b)
    {
        if(a%2==1)
     {
        for(int i=a;i<=b;i+=2)
        {
           int cube=i*i*i;
           System.out.println("cube of "+i+" : "+cube);
           int sum=+cube;
           System.out.println("Sum of cube till "+b+ "is "+sum);
        }
    }
    else
    {
        for(int i=a+1;i<=b;i+=2)
        {
           int cube=i*i*i;
           System.out.println("cube of "+i+" : "+cube);
           int sum=+cube;
           System.out.println("Sum of cube till "+b+ "is "+sum);
        }
    }
    }
}
class Program7
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        One.sumCubes(a, b);
    }
}