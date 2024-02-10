import java.util.Scanner;

public class UserInput
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What's your name ?");
        String name=scanner.nextLine();
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Favourite food?");
        String food=scanner.nextLine();
        
        System.out.println("Hello "+name);
        System.out.println("Your Age is "+age);
        System.out.println("Food: "+food);
    }
}