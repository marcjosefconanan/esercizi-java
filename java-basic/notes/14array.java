// now lets talk about arrays, Arrays are very important 

//they are either "vectors" or "matrix". 

// hw to declear an array 

int[]arrayEmpty;

//declear and start an array 

int[]arrayStart = {11,3,2,23,5,6,7};

//how to run or access an elemnt in that array. 
// an array's count always starts with ZERO "0"

System.out.println("element 2nd number in arrayStart" + arrayStart[1]);

// how to put in a value. 

arrayEmpty[0] = 1;
arrayStart[2] = 66;
System.out,print("new element value of 2nd number in arrayStart: " + arrayStart[1]);

// in an array theres a proprerty yhat can indicate the length of an array.

System.out.print("Array lenght of arrayStart: "+ arrayStart[1]);

// let's try some code. 

public class MyClass {
    public static void main(String [] args){
        int[] x = {77,88};
        int[] y = {55,99};

        System.out.println("y = " + z);
    }
}

// how would you get access to the second element of the array "Y"
//By doing this : 

System.out.println("y[1] = " + y[1]);//x[1] = 88
System.out.println("x[1] = " + x[1]);//x[1] = 99

// additional rule you can't put the value of array after your initialization 
// it will just give you errors. 

System.out.println("Length of y =" + 7.length);//Length of y = 2.


//_____________________________________________________________________________________________________________________________


//ARRAY AND FOR LOOPS. 

// there are 2 ways to do this, because as u may know we have 2 different types of for loop.

//WE HAVE HERE "for loop." (this HAS AN INDEX!!)

string[] pizze = {"Margherita", "Marinara", "4 formaggio" , "Diavola", "Boscaiola"};

for (int i = 0; i < pizze .lenght; i++);
//  i starts with 0;this loops codition is when "i" is less than pizzes lenght;when this happens keep adding 1 to i); 
    System.out.println("index: " + i + ", pizza: " + pizze[i]);
        //index: 0, pizza: Margherita
        //index: 1, pizza: Marinara
        //index: 2, pizza: 4 formaggio
        //index: 3, pizza: Diavola
        //index: 4, pizza: Boscaiola


// AND HERE "for each." (DOESN'T HAVE AN INDEX)

String[] pizza = {"Margherita", "Marinara", "4 formaggio" , "Diavola", "Boscaiola"};

for (String pizza: pizza ) {
    //basicaly a shortcut without the index value and no lenght. 
    System.out.prinln("pizza: " + pizza);
        //pizza: Margherita
        //pizza: Marinara
        //pizza: 4 formaggio
        //pizza: Diavola
        //pizza: Boscaiola
}

//now what are the differences between this two ? 

//now one is with index and one has no index 

//so if we want to have access to all the elemts for anothe opperation AND we dont need the index. then its better to use "For each."
//why ? first its easier to write and the code will be cleaner because we don't have the ability to change the index. 


//but if we wanted to compare the elemnts value or we want to exclude a few elemnts in a method or use the index then we may use "For loop."



