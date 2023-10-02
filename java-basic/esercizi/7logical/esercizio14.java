//Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.

public class esercizio14 {

    public static void main(String[] args) {
        int a = 7;

        System.out.println("Il numero è: " + a);

        boolean pari = pari(a);

//ciao anto, allora mo ho usato questo che non so se va bene xkè non lo visto sul video ma lo usavo su js e funziona
//ho provato altri modi ma non mi veniva poi vabbè ho fatto prima queto e funzionava quindi.. se non è giusto perdonami haha.
        System.out.println(pari ? "Il numero è pari." : "Il numero è dispari.");
    }  

    public static boolean pari(int a) {
        return (a % 2 == 0);
    }
}