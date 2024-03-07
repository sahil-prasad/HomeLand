import java.util.Scanner;
class One

{
    static void sumCubes(int a,int b)
    {
        if(a%2==1)
     {
        for(int i=a;i<=b;i+=2)
        {
           int sum2=0;
           int cube=i*i*i;
           System.out.println("cube of "+i+" : "+cube);
           int sum2=+cube;
           System.out.println("Sum of cube till "+a+ "is "+sum2);
	a++;
        }
    }
    else
    {
        for(int i=a+1;i<=b;i+=2)
        {
           int sum1=0;
           int cube=i*i*i;
           System.out.println("cube of "+i+" : "+cube);
           sum1=+cube;
           System.out.println("Sum of cube till "+b+ "is "+sum1);
	a++;
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