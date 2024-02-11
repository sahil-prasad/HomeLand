import java.util.Scanner;
public class Test3
{
    public static void main(String[] args)
    {
      Scanner test=new Scanner(System.in);
      System.out.println("What's your name?");
      String name=test.nextLine();
      System.out.println("What's your age?");
      int age=test.nextInt();
      test.nextLine();
      System.out.println("What's your favourite food?");
      String food=test.nextLine();
      
      
      System.out.println("Your name is:"+name);
      System.out.println("Your age is:"+age);
      System.out.println("Your favourite food is"+ food);  
      
      
    }
}
