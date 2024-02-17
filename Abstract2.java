abstract class Demo1
{
int x,y;
void f1()
{
x=5;
y=2;
}
abstract void f2();

}

class Demo2 extends Demo1
{
int z;
void f3()
{
z=8;
}
void f2()//override
{
}

}

class Abstract2
{
public static void main(String []args)
{
Demo2 d1=new Demo2();
d1.f3();


}
}