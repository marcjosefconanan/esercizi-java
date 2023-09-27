//NUMERICAL OPERATIONS.

// these are basic numerical operators. 
public class MyClass {
    public static void main (String [] args ){
        int a = 20;
        int b = 50;
        System.out.println("a = " a); // a = 20
        System.out.println("b = " b); // b = 50

        int resaultSum = a + b ;
        System.out.println("Sum: " + resaultSum ); // Sum: 70

        int resaultSub = a - b ;
        System.out.println("Subtraction: " + resaultSub ); // Subtraction: 30

        int resaultMult = a * b ;
        System.out.println("Multiplication: " + resaultMult ); // Multiplication: 1000

        int resaultDiv = a / b ;
        System.out.println("Division: " + resaultDiv ); // Division: 0 

         int resaultMod = a % b ;
        System.out.println("Modulo: " + resaultMod ); // Division: 20 *this is what remaind on the division.  

        // now we will see the increment and decrement operators

        a++;
        System.out.println("increment: " + resaultInc ); // 21

        a--;
        System.out.println("decrement: " + resaultDec ); // 20
        //ATTNTION the increment and decrement operators are always done in the end. meaning it can affect the result of a given result.
    }
}
 