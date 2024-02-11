import java.util.Scanner;

public class halfperroe {
   public halfperroe() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number of rows and number of columns");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();

      for(int var4 = 1; var4 <= var2; ++var4) {
         for(int var5 = 1; var5 <= var3; ++var5) {
            if (var4 >= var5) {
               System.out.print("*");
            } else {
               System.out.print(" ");
            }
         }
      }
      String newline=System.lineSeparator();
      System.out.println(" "+newline);
      
   }
}
