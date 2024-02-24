import java.util.Scanner;
class Classes
{
    static void Held(float a)
    {
        System.out.println("Total Classes Held is "+a);
    }  
}
class Attended extends Classes
{
    static void Attending(float b)
        {
            System.out.println("Total Classes attended is "+b);
        }   
}
class Eligibility extends Attended
{
    static void Eligible(float c)
    {
     if(c>=75 && c<=100)
     {
        System.out.println("Eligible To Take Exam");
     } 
     else if(c<=74 && c>=0)
     {
        System.out.println("Low Attendance! Not Eligible To Take Exam");
     }  
     else
     {
        System.out.println("Enter value within range");
     }
    }
}
public class Program4
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        Classes.Held(a);
        Attended.Attending(b);
        float c=(b/a)*100f;
        Eligibility.Eligible(c);

    }
}
