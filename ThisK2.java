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
this.x=x;// goes to child
this.y=y;// goes to child
}
}



class ThisK2
{
public static void main(String []args)
{
Example11 e1= new Example();
e1.f3(7,9);

/*
Example e1 = new Example();
e1.f1(55,66);
e1.display();
Example e2=new Example();*/
}
}