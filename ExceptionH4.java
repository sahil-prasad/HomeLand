class ExceptionH4
{
public static void main(String []args)
{
String s1=null;
try
{
System.out.println(s1.length());
System.out.println(5/0);
}

catch(NullPointerException n1)
{
System.out.println(n1.getMessage());
}
catch(ArithmeticException n2)
{
System.out.println(n2.getMessage());
}

System.out.println("A");


System.out.println(5/0);
System.out.println("B");
}
}