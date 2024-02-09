class Test8
{
public static void main(String []args)
{
int x=Integer.parseInt("10110",2);
System.out.println(x);

Integer x1=Integer.valueOf("10110",2);
int y=x1.intValue();
System.out.println(y);
}
}
