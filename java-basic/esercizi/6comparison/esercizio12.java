//Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
//Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.


public class esercizio12 {
    public static void main (String []args){
        char a = 'a';
        char b = 'b';

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        boolean abEquals = equal (a, b);

        System.out.println ("are these 2 characters equal? : "+ abEquals);
    }
    public static boolean equal (char a, char b){
        boolean result = (a == b);
        return result;
    }
}