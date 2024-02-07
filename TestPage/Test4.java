class Object1
{
static void fun1()
{
System.out.println("One");
}
static void fun2()
{
System.out.println("Two");
}
}

class Object2
{
static void fun1()
{
System.out.println("Three");
}
static void fun2()
{
System.out.println("Four");
}
}

class Test4
{
public static void main(String[] args)
{
System.out.println("Counting Starts:");
Object1.fun1();
Object1.fun2();
Object2.fun1();
Object2.fun2();
}
}


