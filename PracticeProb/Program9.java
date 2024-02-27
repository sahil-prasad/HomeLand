import java.util.Scanner;
class One
{
    static void Display(int a)
    {
      
      System.out.println(a);
      
      System.out.println("All Four Numbers Entered"+a);  
      
    }
}
class Program9
{
    public static void main(String []args)
    {
        int i=1,num=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter a number");
            num=sc.nextInt();
            i++;
        }
        while(i<5 && num!=0);
        One.Display(num);
    }
}
