//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri. 
//Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

public class OccorrenzeCarattere {
    public static void main(String[] args) {
        char[] caratteri = creaArrayCaratteri();
        stampaOccorrenzeA(caratteri);
    }

    public static char[] creaArrayCaratteri() {
        char[] array = {'a', 'b', 'c', 'a', 'd', 'e', 'f', 'a'};
        return array;
    }

    public static void stampaOccorrenzeA(char[] array) {
        int conteggioA = 0;

        for (char carattere : array) {
            if (carattere == 'a') {
                conteggioA++;
            }
        }

        if (conteggioA > 0) {
            System.out.println("Il carattere 'a' appare " + conteggioA + " volte.");
        } else {
            System.out.println("Il carattere 'a' non appare.");
        }
    }
}