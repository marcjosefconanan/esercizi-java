//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
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



//Ecco una spiegazione passo per passo del codice:

//Importiamo le classi ArrayList e Arrays dal package java.util. Questo è necessario perché useremo ArrayList per tenere traccia degli elementi unici e Arrays per stampare l'array risultante.

//Nel metodo main, inizializziamo un array di interi chiamato array con alcuni elementi.

//Chiamiamo il metodo rimuoviDuplicati passando l'array come argomento e assegniamo il risultato a una variabile chiamata risultato.

//Stampiamo l'array risultante utilizzando Arrays.toString(risultato).

//Nel metodo rimuoviDuplicati, creiamo un ArrayList di interi chiamato unici per tenere traccia degli elementi unici.

//Iteriamo attraverso l'array di input utilizzando un loop for-each. Se l'elemento non è già presente nell'ArrayList unici, lo aggiungiamo.

//Creiamo un nuovo array chiamato risultato con la stessa lunghezza di unici.

//Copiamo gli elementi da unici a risultato.

//Restituiamo l'array risultato.

//Il programma stampa l'array risultante che non contiene elementi duplicati. Ad esempio, se esegui questo programma, otterrai: