public class Sample {
    public static void main(String[]args){
        float max=3.40282346638528860e+38f;//4 bytes
        float min=1.40129846432481707e-45f;
        double doubleMax=1.79769313486231570e+308d;//8 bytes
        double doubleMin=3.40282346638528860e-324d;
        System.out.println(max);
        System.out.printf("%2f",max);
        System.out.printf("%2f",min);

        System.out.println(doubleMax);
        System.out.printf("%2f",doubleMax);
        System.out.printf("%2f",doubleMax);
    }
    
}
