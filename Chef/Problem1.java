import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's the radius of the circle");
        int radius=sc.nextInt();
        double area=3.14*radius*radius;
        System.out.println("Area of circle is:"+area);
        
    }
}