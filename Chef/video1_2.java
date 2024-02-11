import java.util.Scanner;
public class video1_2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entere teh radius of the circle:");
        float radius=sc.nextFloat();
        double area;
        area=3.14*radius*radius;
        System.out.println(area);


    }
}