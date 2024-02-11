import java.util.Scanner;
public class Combination
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter either one: 1.Character At    2.length    3.LowerCase     4.UpperCase     5.Substring");
        int num;
        num=sc.nextInt();
        
        System.out.println("Enter a Word");
        String name;
        name=sc.next();

        if(num==1)
        {
        System.out.println("Character at which place?");
        int a;
        a=sc.nextInt();
        System.out.println(name.charAt(a));
        }
        if(num==2)
        {
        System.out.println(name.length());
        }       
        if(num==3)
        {System.out.println(name.toLowerCase());}

        if(num==4)
        {System.out.println(name.toUpperCase());}

        if(num==5)
        {System.out.println("Substring from?");
        int b;
        b=sc.nextInt();
        System.out.println(name.substring(b));}


    }
}