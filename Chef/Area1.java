import java.util.Scanner;
public class Area1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        System.out.println("5.Exit");
        int ch=sc.nextInt();
        double length,breadth,radius,area,height,base;
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter the length");
            length=sc.nextDouble();
            System.out.println("Enter the breadth");
            breadth=sc.nextDouble();
            area=length*breadth;
            System.out.println("Area is"+area);
            break;
            case 2:
            System.out.println("Enter the length of the side");
            length=sc.nextDouble();
            area=length*length;
            System.out.println("The area is"+area);
            break;
            case 3:
            System.out.println("Enter the radius");
            radius=sc.nextDouble();
            area=3.14*radius*radius;
            System.out.println("The area is "+area);
            break;
            case 4:
            System.out.println("Enter the base");
            base=sc.nextDouble();
            System.out.println("Enter the height");
            height=sc.nextDouble();
            area=0.5*base*height;
            System.out.println("The area of the triangle is"+area);
            break;
        }
        

    }
}