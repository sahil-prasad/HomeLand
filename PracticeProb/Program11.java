public class Program11
{
    public static void main(String []args)
    {
        int i=3,j=6;
        for(;i<j;i++)
        {
            System.out.println();
            for(int k=j;k>i;k--)
            {
                System.out.print("#");
            }
        }
    }
}