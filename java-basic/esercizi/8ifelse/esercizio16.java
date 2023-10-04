//Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi 
//"Lunghezza maggiore di 10","Lunghezza minore di 10" o "Lunghezza pari a 10"

public class esercizio16 {
    public static void main (String [] args ){
         String str = "abcdefghijk";

         System.out.println("String = " + str);

         int lunghezza = str.length(); 

         if (lunghezza > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (lunghezza < 10) {
            System.out.println("Lunghezza minore di 10");
        } else {
            System.out.println("Lunghezza pari a 10");
        }
    }
}