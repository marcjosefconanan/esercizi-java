//AND HERE WE ARE THE BELOVED IF ELSE STATEMENTS. 

// let's talk about flow controle. 
//Flow control is essential for writing programs that can adapt to different situations, make decisions, and perform repetitive tasks efficiently. 
//It allows the program to respond to user input, handle errors, and process data in a structured and logical manner.


//"If it's sunny, I'll go outside. Otherwise, I'll stay inside."

//In Java, this would be expressed as:

java
Copy code
if (sunny) {
    goOutside();
} else {
    stayInside();
}

//Here's a simple breakdown:
//if (condition) checks if a certain condition is true.
//If the condition is true, the code inside the curly braces {} after if is executed.
//If the condition is false, the code inside the curly braces {} after else is executed.
//For example:

java
Copy code
int temperature = 25;

if (temperature > 30) {
    System.out.println("It's hot, stay inside!");
} else {
    System.out.println("It's nice, go outside!");
}
//In this example, if the temperature is greater than 30, it prints "It's hot, stay inside!". Otherwise, 
//it prints "It's nice, go outside!".

//Remember:

//if statements help you make decisions based on conditions.
//else provides an alternative action if the condition is not met.
//This is a fundamental concept in programming because it allows your program to make choices and perform 
//different actions based on different scenarios.


public class myclass {
    public static void main (String []args ){
        int y = 10;
        int x = 20;

        if (x > y ){

            //do something
            xMaggioreDiY();

        }else if (x == y){
            //do something else 
            xUgualeAY();

        }else {
            //do something else
            xMinoreDiY();
        }
       System.out.println("X = "+ x);
       System.out.println("Y= "+ y);
    }

    public static void xMaggioreDiY(){

        System.out.println("X e maggiore di Y");
    }

    public static void xUgualeAY(){
        System.out.println("X e uguale a Y ");
    }

    public static void xMinoreDiY(){
        System.out.println("X e minore di Y");
    }
}