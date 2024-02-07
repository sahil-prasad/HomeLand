class Object1
{
void fun1()
{
System.out.println("One");
}
void fun2()
{
System.out.println("Two");
}
}

class Object2
{
void fun1()
{
System.out.println("Three");
}
void fun2()
{
System.out.println("Four");
}
}

class Test5
{
public static void main(String[] args)
{
System.out.println("Counting starts:");
Object1 o1=new Object1();
Object2 o2=new Object2();
o1.fun1();
o1.fun2();
o2.fun1();
o2.fun2();
}
}



