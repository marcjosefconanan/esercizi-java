//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

import java.util.ArrayList;
import java.util.Arrays;

public class Esercizio26 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9};

        int[] risultato = rimuoviDuplicati(array);

        System.out.println(Arrays.toString(risultato));
    }

    public static int[] rimuoviDuplicati(int[] array) {
        ArrayList<Integer> unici = new ArrayList<>();
        for (int elemento : array) {
            if (!unici.contains(elemento)) {
                unici.add(elemento);
            }
        }

        int[] risultato = new int[unici.size()];
        for (int i = 0; i < unici.size(); i++) {
            risultato[i] = unici.get(i);
        }

        return risultato;
    }
}
