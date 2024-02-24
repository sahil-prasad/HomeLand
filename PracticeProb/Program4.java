import java.util.Scanner;
class Classes
{
    static void Held(int a)
    {
        System.out.println();
    }  
}
class Attended extends Classes
{
    static void Attending(int b)
        {
            System.out.println();
        }   
}
class Eligibility extends Attended
{
    static void Eligible(int c)
    {
     if(c>=75)
     {
        System.out.println("Eligible To Take Exam");
     } 
     else
     {
        System.out.println("Low Attendance! Not Eligible To Take Exam");
     }  
    }
}
public class Program4
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Classes.Held(a);
        Attended.Attending(b);
        int c=(b/a)*100;
        Eligibility.Eligible(c);

    }
}
