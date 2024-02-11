public class BasicString {
    public static void main(String[]args){

        String var1=" Study \u00f1";
        String var2="100";
        int var3= 10;
        System.out.println(var1+var2+var3);//+ is overloaded character
        System.out.println(Integer.parseInt(var2)+10);
        System.out.println(var1+var2+var3);
    }
    
}
