//while loops. 

 //what is a loop ? 

// a loop as intended by ht namae is a code that repeats a code repetedly until it satifys a condition. 

// example: 
// we write a code that goes thru a set of numbers until it finds your favorite number, and a loop will do this until it finds 
//ur fav number. "which is 6"

// these are the types of loop 

//while loop. 

//example of a while code: 

numberOfFruitUWant = 5 ;
numberOfFruitInTheCart = 0;

while (numberOfFruitInTheCart < numberOfFruitUWant) {
    //when the number of fruit in the cart is less than the number of fruit you want
        addToUrCart(numberOfFruitInTheCart)
    //add to cart the number of fruit that u want. 
        numberOfFruitInTheCart = numberOfFruitInTheCart + 1 
    //continue to add 1 to the cart until it reaches the number of fruit that u want. 
}

//now theres a special case and its name is "do while."

// what is the difference between "while loop" and "do/while loop" ?
// lets see togehter: 

//this is it's syntax 

do {
    //code
}while (condition)

//example 
//
numberOfFruitUWant = 5 ;
numberOfFruitInTheCart = 0;

do{
    addToUrCart(numberOfFruitInTheCart)
    numberOfFruitInTheCart = numberOfFruitInTheCart + 1
}   while (numberOfFruitInTheCart < numberOfFruitUWant)
// as you can see here the main difference is that the condition is executed BEFORE the executio on the code. 

// what "while loop" does is this:
// while loop: "i check if the condition are met then i execute the code."


// what "do/while loop" does is this:
//do/while loop: "i execute the code then check if the conditions are met."