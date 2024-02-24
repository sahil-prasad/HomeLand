import java.util.Scanner;
class Triangle
{
    static void Triangle(float b,float h)
    {
        float c=1/2*(b*h);
        System.out.println("Area of Triangle is"+c);
    }
}
class Rectangle
{
    static void Rectangle(float w,float h)
    {
        float c=w*h;
        System.out.println("Area of Rectangle is "+c);
    }
}
class Parallelogram
{
    static void Parallelogram(float b,float h)
    {
        float c=b*h;
        System.out.println("Area of Parallelogram is "+c);
    }
}
class Circle
{
    static void Circle(float r)
    {
        double c=(3.14)*r*r;
        System.out.println("Area of Circle is "+c);
    }
}
class Ellipse
{
    static void Ellipse(float a,float b)
    {
        double c=(3.14)*b*a;
        System.out.println("Area of Ellipse is "+c);
    }
}
class Program5
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base,vertical height,width,height,base,vertical height,radius,semi-major,semi-minor axis length");
        float b=sc.nextInt();
        float h=sc.nextInt();
        float w=sc.nextInt();
        float he=sc.nextInt();
        float ba=sc.nextInt();
        float vh=sc.nextInt();
        float r=sc.nextInt();
        float a=sc.nextInt();
        float bm=sc.nextInt();
        Triangle.Triangle(b,h);
        Rectangle.Rectangle(w, he);
        Parallelogram.Parallelogram(ba, vh);
        Circle.Circle(r);
        Ellipse.Ellipse(a,bm);

        

    }
}
