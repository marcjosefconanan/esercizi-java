//CASTING 

// casting is converting one type of data into aother (better to call it a culting am i right ? haha )
//EASY () WITH THIS WE CAN CULT.. THEM ALL TO WHAT EVER WE WANT. 
// what do we do if we wanted to to conver a "char" to a "string" ? easy 
// we use a the String.valueOf()**

public class MyClass {

    public static void main(String args[]) {

      int x = 1;
      float y = 3f;
      double z = x / y;
      char c = 'c';
      char d = 'd';
      String sommaCd = String.valueOf(c) + String.valueOf(d);//** this one. 
      boolean bool = true;
      String text = "text";

      System.out.println("x = " + x);// x = 1
      System.out.println(", y = " + y);// , y = 3.0
      System.out.println("Sum of x / y = " + z);// Sum of x / y = 0.3333333432674408
      System.out.println("value char c = " + c); // value char c = c
      System.out.println("value boolean bool =" + bool ); // value boolean bool =true
      System.out.println("value String text =" + text ); // value String text =text

      System.out.println("sommaCd = " sommaCd ); // sommaCd = cd


// now how can we cult.. i mean cast them to another data type ? by doing so : 
      int x = 1;
      int y = 3;
      double z = (double)x / (double)y; // as you can see this is the solution !!

       System.out.println("x = " + x);// x = 1
      System.out.println(", y = " + y);// , y = 3
      System.out.println("Sum of x / y = " + z);// Sum of x / y = 0.3333333
    }
}








