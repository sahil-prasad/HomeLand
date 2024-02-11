import java.util.Scanner;
public class example3{
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static float calculateProduct(float c,float d){
        float product=c*d;
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println(calculateProduct(c, d));
        System.out.println(calculateSum(a, b));
    }
}