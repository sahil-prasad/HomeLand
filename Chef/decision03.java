public class decision03 {
    public static void main(String[]args){
        boolean x=true;
        boolean y=false;
        if(x || y  && y & x){// both need to be true- and operator(&);one true- ||(or)
            System.out.println("Condition is true");

        }
        else{
            System.out.println("Condition is false");
        }
    }
    
}