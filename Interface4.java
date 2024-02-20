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
int x=9;
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


class Interface4
{
public static void main(String []args)
{

i2.f2();
}
}