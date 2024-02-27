import java.util.Scanner;
class One
{
    static void Display(int p)
    {
        System.out.println("Even Number=4");
    }
}
class Program10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,i=0,even=0;
        do
        {
            a=sc.nextInt();
                i++;
                if(a%2==0)
                {
                    even++;
                }
        }
        while(i<10 && even <4);
        One.Display(a);
        
    }
}