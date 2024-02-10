import java.util.Scanner;
public class HW1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("English Marks:");
        float eng=sc.nextFloat();
        System.out.println("Maths Marks:");
        float maths=sc.nextFloat();
        System.out.println("Hindi Marks:");
        float hindi=sc.nextFloat();
        System.out.println("Science Marks:");
        float science=sc.nextFloat();
        System.out.println("Physical Education Marks:");
        float pe=sc.nextFloat();
        
        float percentage=(eng+maths+hindi+science+pe)/5;
        System.out.println("Your Percentage is:"+percentage);
    }
}