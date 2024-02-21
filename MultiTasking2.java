class Process1 extends Thread

{
public void run()//overriding function as well as function
{
int i;
for(i=1;i<=10;i++);
{
System.out.println("Process 1"+ i);
}
}
}
class Process2 extends Thread

{
public void run()
{
int i;
for(i=1;i<=10;i++);
{
System.out.println("Process 2"+ i);
}
}
}
class MultiTasking2
{
public static void main(String []args)
{
Process1 p1=new Process1();
Process2 p2=new Process2();
p1.start();
p2.start();

}
}