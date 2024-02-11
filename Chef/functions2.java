import java.util.Scanner;
public class functions2
{
    public static int CalculateProduct(int a,int b)
    {
        return a*b;
 
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(+CalculateProduct(a, b));


}
}