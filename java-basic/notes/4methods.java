//METHODS what ara methods ? A method is a block of code which only runs when it is called.
//You can pass data, known as parameters, into a method.
//Methods are used to perform certain actions, and they are also known as functions.
//Why use methods? To reuse code: define the code once, and use it many times.

public class MyClass {

    public static void main(String args[]) {

      double x = 1;
      double y = 3;
      //int z = (int)x + (int)y;
      char c = 'c';
      char d = 'd';
      String sommaCd = String.valueOf(c) + String.valueOf(d);//** this one. 
      boolean bool = true;
      String text = "text";

      System.out.println("x = " + x);// x = 1
      System.out.println(", y = " + y);// , y = 3.0
      System.out.println("Sum of x + y = " + z);// Sum of x / y = 0.3333333432674408
      System.out.println("value char c = " + c); // value char c = c
      System.out.println("value boolean bool =" + bool ); // value boolean bool =true
      System.out.println("value String text =" + text ); // value String text =text

      System.out.println("sommaCd = " sommaCd ); // sommaCd = cd

    }
    public static int String sum (double x, double y){
        int z = (int)x + (int)y;
        return String.valueOf(z);
//this is how we use a method. and this is a normal method 
    }
    public static int String sum (int x, int y){
        int z = (int)x + (int)y;
        return String.valueOf(z) ;
// this is a method overriding its where you use the same name for a function but u overide it to get another resault. 
}
}
