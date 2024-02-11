public class switchit {
    public static void main(String[]args){
        int x=1;//use with integer,char and strings
        char y='B';
        switch(Character.toLowerCase(y)){
            //switch(z.toLowerCase())
            case 1:
            case 'a':
            System.out.println("x is 1");
            break;
            case 2:
            case 'b':
            System.out.println("x is 2");
            break;
            case 3:
            System.out.println("x is 3");
            break;
            default:
            System.out.println("none of the case");//sequence to default doesnt matter
            //use break after default too
            //string to lowercase- y.toLowerCase()
        }
        
        
    }
    
}
