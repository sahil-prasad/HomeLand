public class typeCasting01 {
    public static void main(String[]args)
    {
        short a1=100; //byte a2=a1; won't work 127 is upper limit of byte
        byte  a2=(byte) a1;
        System.out.println(a2);
    }
    
}
