//LOGICAL OPERATORS.
// WHAT ARE THEY ? 

public class MyClass {
    public static void main (String [] args ){
        int a = 20;
        int b = 150;

        System.out.println("a = " + a ); // a = 20
        System.out.println("b = " + b); // b = 50 
        
        // this && is operator "AND" its used to make sure that the two condition is satisfied. 
        boolean abAnd = (a > 10) && (y < 100) ;
        System.out.println("AND " + abAnd); // this is false because b is not less than 100. 

         // this || is operator "OR" its used to make sure that atleast one condition is satisfied. if both is satified then OR will be false. 
        boolean abOr = (a > 10) || (y < 100) ;
        System.out.println("OR " + abOr); // this is true because a is greater than 10. 

         // this ! "NOT" it inverts resaults. 
        boolean abNot = !(a > 10) || (y < 100) ;
        System.out.println("OR " + abNot); // this is false because in or this would be true. 
    }
}