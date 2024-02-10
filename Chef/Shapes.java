import java.util.Scanner;
public class Shapes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area Calculation");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Parallelogram");
        System.out.println("4.Circle");
        System.out.println("6.Ellipse");
        System.out.println("Enter your choice from the above options");
        int ch=sc.nextInt();
        double area,base,height,width,radius,a,b;
        switch(ch)
        {
            case 1:
            System.out.println("Enter the base of the triangle");
            base=sc.nextDouble();
            System.out.println("Enter the height of the triangle");
            height=sc.nextDouble();
            area=0.5*base*height;
            System.out.println(area);
            break;

            case 2:
            System.out.println("Enter the width of the rectangle");
            width=sc.nextDouble();
            System.out.println("Enter the height of the rectangel");
            height=sc.nextDouble();
            area=height*width;
            System.out.println(area);
            break;

            case 3:
            System.out.println("Enter the base of the parallelogram");
            base=sc.nextDouble();
            System.out.println("Enter the height of the parallelogram");
            height=sc.nextDouble();
            area=base*height;
            System.out.println(area);
            break;

            case 4:
            System.out.println("Enter the radius of the circle");
            radius=sc.nextDouble();
            area=3.14*radius*radius;
            System.out.println(area);
            break;

            case 5:
            System.out.println("Enter the length of semi-major axis of ellipse");
            a=sc.nextDouble();
            System.out.println("Enter the length of semi-minor axis of ellipse");
            b=sc.nextDouble();
            area=3.14*a*b;
            System.out.println(area);
            break;
            
            case 6:
            System.out.println("Exiting...............");
            break;

        
        }
    }
}