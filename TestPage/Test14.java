class Demo
{
int x,y;
float a,b;
void f1(int p,int q)
{
p=x;
q=y;
System.out.println(x+y);
}
void f2(int p,int q)
{
p=x;
q=y;
System.out.println(x+y);
}
Demo(float p,float q)  //use of constructor
{
a=p;b=q;
System.out.println(a/b);
}
}
class Test14
{
public static void main(String []args)
{
Demo d1 =new Demo(2,4);
}
}

