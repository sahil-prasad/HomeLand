class Demo
{
int x,y;
Demo()
{
x=5;
y=6;
}
void f1()
{
x=22;
y=23;
}



}
class Construct3
{
public static void main(String []args)
{
Demo d1 =new Demo();
System.out.println(d1.x);
System.out.println(d1.y);

}
}