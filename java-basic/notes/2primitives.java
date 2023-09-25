//PRIMITIVES DATA TYPES.
//types of primitives 

//int == (intiger) whole numbers 1,2,3,4,5,6,7,8,9,10.....
//float == decimal numbers 1.1,1.10,1.55, 3.6,10.5,100.4.... you have to put "f" in the end of the value.
//double == an even more accurate number 0.333333, 123.123231 ..... you have to put "d" in the end of the value.
//char == (characters) their letters a,b,c,d,e,f,g.... you have to put '' in the value.
//boolean == true or false.

//NOW THIS ARE NOT PRIMITIVES MEANING THEY ARE OBJECTS 
// as you can see the "S" in string is in uppercase unlike the primitives with all lower case letters.

// String == text all kind of texts apple,grapes,orage,boy,cat,dog.... you have to put "" in the value


//the combinations:
//int + float = java translates the two into float. 
//float + double = it just gives a less accurate number from two doubles. ex : WITH 2 DOUBLES ( 1 / 3 = 0.33333333)
//WITH float + double (1 / 3 = 0.3334) AS YOU CAN SEE ITS LESS ACCURATE.

public class MyClass {

    public static void main(String args[]) {

      int x = 15;
      int y = 25;
      int z = x / y;

      System.out.println("x = " + x);
      System.out.println(", y = " + y);
      System.out.println("Sum of x / y = " + z); //it aswered "0" as you can see this gives us a wrong aswere 
      //this gives us : 
      // x = 15, y = 25
      //sum of x / y = 0
      

      // now why is tht ?? we all know 15 divided by 25 doesn't add up to "0" 
      //now this is because of the "int" it's all his fault haha
      //but srsly int is an intiger (a whole number) so all the resaoult an integer will give are whole numbers like so 
      // so the question we asked the integer is "how may 15 are in a 25" and since he can only respond in whole numbers..
      // his aswere is "0"

        //now how can we fix this ? one way is to have a decimal number right like a 0.5 type of aswere and for that we have 
        // Mr. "Float"

      int x = 15;
      //now you can also make both the variables float but in this case it can be done with just one.   
      float y = 25f;
      //when using float its better if we use the 25"f" at the end of a value so that we can specify what type of value it has. 
      float z = x / y;

      System.out.println("x = " + x);
      System.out.println(", y = " + y);
      System.out.println("Sum of x / y = " + z); //the aswere here is "0.6" and its correct. 

      int x = 1;
      float y = 3f;
      double z = x / y;
      char c = 'c';
      char d = 'd';
      boolean bool = true;
      String text = "text";

      System.out.println("x = " + x); //
      System.out.println(", y = " + y); // x = 1, y = 3.0
      System.out.println("Sum of x / y = " + z); // Sum of x / y = 0.33333333332674408
      System.out.println("value char c = " + c); // value char = c
      System.out.println("value boolean bool =" + bool ); //value boolean bool = true
      System.out.println("value String text =" + text ); // value String text = text

      System.out.println("c + d = " + c + d ); // c + d = cd

    }
}