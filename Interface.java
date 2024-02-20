interface i1
{
int x=6;
void f1() //we cannot define function in interface
{
System.out.println(x);
}
static void f2() //we can define using static
{
System.out.println(x);
}
}
class Interface
{
public static void main(String []args)
{
i1.f2();
}
}
