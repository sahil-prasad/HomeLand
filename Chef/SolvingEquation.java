public class SolvingEquation {
    public static void main(String[]args){
        //(a+b)^2=a^2+2ab+b^2
        int a=24;
        float b=42.159f;
        double value=(a*a)+(2*a*b)+(b*b);
        System.out.println(value);
        System.out.println((float)value);

        int value1= (int)((a*a)+(2*a*b)+(b*b));
        System.out.println(value1);

    }
    
}
