class Demo
{
int x,y;
Demo()
{
System.out.println("Constructor 1 Executed");
}
void f1()
{
System.out.println("Function 1 Executed");
}



}
class Construct2
{
public static void main(String []args)
{
Demo d1 =new Demo();
Demo d2 =new Demo();
Demo d3 =new Demo();

}
}