import java.util.Scanner;
public class conditionals
{
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the age:");
     int age=sc.nextInt();
     if(age==18)
     {
     System.out.println("You can drive");
     }  
    else{
    System.out.println("Sorry you can't");
     
    } 
}

}

