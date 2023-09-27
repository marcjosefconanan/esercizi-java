//COMPARISON OPERATORS.
// as the name implies it compares two value and sees how different or same they are. 


public class MyClass {
    public static void main (String [] args ){
        int a = 20;
        int b = 50;

        System.out.println("a = " +a ); // a = 20
        System.out.println("b = " + b); // b = 50 
        
        boolean abEquals = a == b ;
        System.out.println("Equal : " + abEquals); // false cuz they don't have the same value. 
        // this is one way to compare if their the same.

    }
}