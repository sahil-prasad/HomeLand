public class enhancedswitch {
    public static void main(String[]args){
        char x='a';
        switch(x){
            case 'a' -> System.out.println("X is one");//case sensitive
            case 'b' -> System.out.println("X is 2");
            case 'c' -> System.out.println("X is 3");
            default -> System.out.println("X is other than 1,2,3");//break not needed
        }
    }
    
}
