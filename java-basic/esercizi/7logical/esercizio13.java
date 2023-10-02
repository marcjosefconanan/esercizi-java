//Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
//verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione comprensivo 
//dei due limiti (inferiore e superiore)

public class esercizio13 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int comp = 15;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Comparison = " + comp);

        boolean tra = tra(a, b, comp);

        System.out.println("Il valore di confronto è compreso tra " + a + " e " + b + ": " + tra);
    }

    public static boolean tra(int meno, int piu, int comp) {
        return comp >= meno && comp <= piu;
    }
}