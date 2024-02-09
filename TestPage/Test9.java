class Test9
{
public static void main(String []args)
{
//int x=Integer.parseInt("10110",2);
//System.out.println(x);

Integer x1=Integer.valueOf("10110",2);
int y= x1.intValue();
System.out.println(y);


Integer z=Integer.valueOf("1001110",2);
int a=z.intValue();
System.out.println(a);


Integer b=Integer.valueOf("10111000",2);
int c=b.intValue();
System.out.println(c);


}
}
