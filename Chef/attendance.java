import java.util.Scanner;
public class attendance
{ 
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Total Class Attended:");
        int attended=sc.nextInt();
        System.out.println("Enter Total Number Of Classes Held:");
        int held=sc.nextInt();
        float percentage=(attended*100/held);
        if(percentage >= 75&& percentage <=100)
        System.out.println("Eligible for Exam");
        else if(percentage <75 )
        System.out.println("Not Eligible For Exam");
        else
        System.out.println("Enter in The Limits");
    }
}