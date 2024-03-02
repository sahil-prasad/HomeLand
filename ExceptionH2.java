class ExceptionH2
{
public static void main(String []args)
{
String s1=null;
try
{
System.out.println(s1.length());
}
catch()
{
catch(NullPointerException n1)
{
System.out.println(n1.getMessage());
}

System.out.println("A");
System.out.println(5/0);
System.out.println("B");
}
}
