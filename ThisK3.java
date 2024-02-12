class Example
{
private int x,y;
void f1(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{

System.out.println(x);
System.out.println(y);
}
}
class Example1 extends Example
{
int x,y;
void f3(int x,int y)
{
super.x=x;// goes to parent
super.y=y;// goes to parent
}
void f4()
{
//no local variable exists-jiska object uska value
System.out.println(super.x);
System.out.println(this.y);
}
}



class ThisK3
{
public static void main(String []args)
{
Example11 e1= new Example();
e1.f3(7,9);
e1.f4();

/*
Example e1 = new Example();
e1.f1(55,66);
e1.display();
Example e2=new Example();*/
}
}