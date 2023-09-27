//Assignment operators

public class MyClass {
    public static void main (String [] args ){
        int a = 20;
        int b = 50;
        //as we may know these is an example of a assignment 
        // we are assigning a to be of 20 value. 

        System.out.println("a = " +a ); // a = 20
        System.out.println("b = " + b); // b = 50 
        

        int resaultSum = a + b ;
        System.out.println("Sum: " + resaultSum ); // Sum: 70

        int resaultSub = a - b ;
        System.out.println("Subtraction: " + resaultSub ); // Subtraction: 30

        int resaultMult = a * b ;
        System.out.println("Multiplication: " + resaultMult ); // Multiplication: 1000

        int resaultDiv = a / b ;
        System.out.println("Division: " + resaultDiv ); // Division: 0 

        int resaultMod = a % b ;
        System.out.println("Modulo: " + resaultMod ); // Division: 20 

        
        
        a++;
        System.out.println("increment: " + resaultInc ); // 21
        //this is also an assignment right ? 
        //this is saying to add 1 to our a (20) 

        //but what if we wanted to add 2 inted of 1 ? 
        int xInc = x + 2;
        System.out.println("xInc: " + xInc); // 22

        //but we can also kinda do this :
         x = x + 2;
        System.out.println("Inc: " + x ); // 22

        //or 

        x += 2;
        System.out.println("Inc: " + x );// 22

        //it just makes our code clean and life easier 
        //what if we wanted to do this "x = x * 2"

        x *= 2;
        System.out.println("result :  " + x ); // 40

        //these are shortcuts but its not tht visible so we dont use it alot 
        //but we do use this with aritmetic porblems 

    }
}