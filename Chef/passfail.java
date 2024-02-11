import java.util.Scanner;
public class passfail
{
    public static void main(String[]args)
    {
        float sub1,sub2,sub3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        sub1=sc.nextFloat();
        System.out.println("enter the marks of second subject");
        sub2=sc.nextFloat();
        System.out.println("Enter the marks of the third subject");
        sub3=sc.nextFloat();
        float percent=(sub1+sub2+sub3)/3;
        if(percent>=40 && sub1>=33 && sub2>=33 && sub3>=33)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}