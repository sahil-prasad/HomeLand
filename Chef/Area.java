import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area Calculation");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Parallelogram");
        System.out.println("4.Circle");
        System.out.println("5.Ellipse");
        System.out.println("6.Exit");
        System.out.println("Enter yout choice");
        int ch=sc.nextInt();
        double area,base,height,width,radius,a,b;
        switch(ch)
        {
            case 1:
            System.out.println("Enter the base of Triangle");
            base=sc.nextDouble();
            System.out.println("Enter Height of the Triangle");
            height=sc.nextDouble();

            area=0.5*base*height;
            System.out.println("Area of triangle is: "+area+"sq.units");
            break;

            case 2:
            System.out.println("Enter the width");
            width=sc.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            height=sc.nextDouble();
            area=width*height;
            System.out.println("The area of rectangle is"+area+"sq.units");
            break;

            case 3:
            System.out.println("Enter the base of parallelogram");
            base=sc.nextDouble();
            System.out.println("Enter the height of parallelogram");
            height=sc.nextDouble();
            area=base*height;
            System.out.println("The area of the parallelogram is "+area+"sq.units");
            break;

            case 4:
            System.out.println("Enter the radius of the circle");
            radius=sc.nextDouble();
            area=3.14*radius*radius;
            System.out.println("The area of circle is "+area+"sq.units");
            break;

            case 5:
            System.out.println("Enter the length of semi-major axis of ellipse");
            a=sc.nextDouble();
            System.out.println("Enter the length of semi-minor axis of ellipse");
            b=sc.nextDouble();
            area=3.14*a*b;
            System.out.println("The area of ellipse is "+area+"sq.units");
            break;

            case 6:
            System.out.println("Exiting........");
            break;





        }


    }
}