interface i1
{
int x=6;
void f1();
static void f2() //we can define using static
{
System.out.println(x);
}
}
interface i2 extends i1
{
int y=2;
void f3();
}
class c1 implements i2
{
public void  f1()
{
}
public void f3()
{
}
}


class Interface3
{
public static void main(String []args)
{
c1 x1=new c1();
System.out.println(x1.x);
i2.f2();
}
}