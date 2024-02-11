import java.util.Scanner;
public class example2{
    public static float calculateProduct(float a,float b){
        float product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println(calculateProduct(a, b));
    }
}