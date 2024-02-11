import java.util.Scanner;
public class tax
{
    public static void main(String[]args)
    {
        int income;
        float tax,cal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Option ");
        System.out.println("1-between 2.5L to 5L");
        System.out.println("2-Between 5L to 10L");
        System.out.println("3-Above 10L");
        income=sc.nextInt();
        switch(income)
        {
            case 1:
            System.out.println("Enter your annual income");
            tax=sc.nextFloat();
            cal=(income*5)/100;
            System.out.println("Your tax is:"+cal);
            break;
            case 2:
            System.out.println("Enter your annual income");
            tax=sc.nextFloat();
            cal=(income*20)/100;
            System.out.println("Your tax is:"+cal);
            break;
            case 3:
            System.out.println("Enter your annual income");
            tax=sc.nextFloat();
            cal=(income*30)/100;
            System.out.println("Your tax is:"+cal);
            break;
            default:
            System.out.println("Please be in limit");
        }
            

        }

        

    }
