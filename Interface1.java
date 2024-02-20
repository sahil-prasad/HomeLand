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

}

}
class Interface1
{
public static void main(String []args)
{
i1.f2();
}
}