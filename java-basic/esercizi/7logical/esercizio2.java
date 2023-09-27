//Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.

public class esercizio1 {

    public static void main(String[] args) {
        int a = 7;

        System.out.println("Il numero è: " + a);

        boolean pari = pari(a);

        System.out.println(pari ? "Il numero è pari." : "Il numero è dispari.");
    }

    public static boolean pari(int a) {
        return (a % 2 == 0);
    }
}