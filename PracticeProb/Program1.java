import java.util.Scanner;
class One
{
    static void SumCubes(int p,int q,int r)
    { 
    int a=p*p*p+q*q*q+r*r*r;
    System.out.println(a);
    }
}
class Two
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        One o1=new One();
        o1.SumCubes(a,b,c);
    }
}