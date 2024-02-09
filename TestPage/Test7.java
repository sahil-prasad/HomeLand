class Test7
{
public static void main(String []args)
{
int x=Integer.parseInt("10110",2);
System.out.println(x);


Integer x1=Integer.valueOf("10110",2); //integer class is predefined
int y=x1.intValue();

System.out.println(y);

}
}
