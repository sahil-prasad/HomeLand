
public class arrayloop
{
    public static void main(String[]args)
    {
    int [] marks;//1-d array
    int [][] flats;//2-d array
    flats = new int [2][3];
    flats[0][1]=101;
    flats[0][2]=102;
    flats[0][3]=103;
    flats[1][0]=201;
    flats[1][1]=202;
    flats[1][2]=203;
    System.out.println("printing a 2-d array using a for loop");
    for(int i=1;i<flats.length;i++)
    {
        for(int j=0;j<flats[i].length;j++)
        {
            System.out.println(flats[i][j]);
            System.out.println(" ");
        }
        System.out.println(" \n ");
    }
    
}
}