
//NOW!! SWITCH STATEMENTS 

//as you can see a code like this with more statements would be too cluncky so that where switch statemens comes in 
// but with swtich we can't have a comaprison but we could see their values directly insted. 
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

// let me show you :
// in this example we can do a comparison but we cant do a comparison with another variable. 
public class myclass {
    public static void main (String []args ){
        int x = 10;

        switch(x){
        case 0: 
            xUgualeA0();
            break;
        case 10
            xUgualea10();
        default: 
            xAltriCasi(x);
        }

       System.out.println("X = "+ x);
       System.out.println("Y= "+ y);
    }

    public static void xUgualea10(){

        System.out.println("X e uguale a 10");
    }

    public static void xAltriCasi(){
        System.out.println("X: " + x );
    }

    public static void xMinoreDi0(){
        System.out.println("X uguale a 0");
    }
}