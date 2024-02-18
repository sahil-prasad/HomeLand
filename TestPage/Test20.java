abstract class Demo
{
void fun1()
{
System.out.println("Hello");
}
void fun2()
{
System.out.println("Hola");
}
Demo()
{
System.out.println("11111");
}
abstract void fun();
}
class Demo1 extends Demo
{
void f3()
{
System.out.println("Anyone");
}
}
class Test20
{
public static void main(String []args)
{
Demo1 d1 =new Demo1();
d1.f3();
}
}
