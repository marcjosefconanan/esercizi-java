//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri. 
//Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

public class esercizio25 {
    public static void main(String[] args) {
        char[] caratteri = creaArray();
        stampaA(caratteri); 
    }

    public static char[] creaArray() { // funzione del array creaArray
        char[] array = {'a', 'b', 'c', 'a', 'd', 'e', 'f', 'a'}; // inizia array con queste dati
        return array;
    }

    public static void stampaA(char[] array) { 
        // Conta quante volte appare il carattere 'a' nell'array e stampa il risultato.
        int conteggioA = 0;

        for (char carattere : array) { // for each 
            if (carattere == 'a') {
                conteggioA++; // ogni volta che vede a fa "+ 1 "
            }
        }

        if (conteggioA > 0) {
            System.out.println("Il carattere 'a' appare " + conteggioA + " volte.");
        } else {
            System.out.println("Il carattere 'a' non appare.");
        }
    }       // conta quante volte ce il carattere 'a'
}
