//Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.


public class esercizio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        boolean abEquals = equal(a, b);

        System.out.println("are the 2 numbers equal ?: " + abEquals);
    }

    public static boolean equal(int a, int b) {
        boolean result = (a == b);
        return result;
    }
}
