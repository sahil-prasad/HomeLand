class Sahil
{
int x;	//instance(object) member variable
int y;
void fun1()   //instance(object) member function
{
System.out.println("fun1");
}
void fun2()
{
System.out.println("fun2");
}
}

class Object1
{
public static void main(String args[])
{
Sahil s1=new Sahil();
s1.fun1();
s1.fun2();
System.out.println(s1.y);
Sahil s2=new Sahil();
System.out.println(s2.x);


}
}
