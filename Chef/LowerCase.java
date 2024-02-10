import java.util.Scanner;

    public class LowerCase
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Sentence");
            String x=sc.nextLine();
            String name=x.toLowerCase();

            System.out.println(name);
        }
    }
