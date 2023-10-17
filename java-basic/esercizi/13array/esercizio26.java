//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

//notes
//creare un array che ha dei dublicati check!!


//array = [1,2,3,4,5,6,7,8,9,1,1,1,1,2]
//        Mi prendo il primo elemento dell’array quindi array[0] = a è la salvo in  in un nuovo array newArray. newArray[a]
//        Passo al secondo elemento array[1] = b, controllo se array[1] è presente in newArray[], in questo caso no, aggiungo array[1] in newArray[a,b].
//        Vado al terzo elemento array[2] = a, controllo se l’elemento array[2] è dentro newArray,
//        è presente non lo aggiungo e passo al prossimo elemento.

//crea un nuovo array senza i duplicati

//copia i elemnti non duplicati


public class esercizio26 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9};

        // rimuove i duplicati
        int[] risultato = rimuoviDuplicati(array);

        System.out.println(java.util.Arrays.toString(risultato));
    }

    public static int[] rimuoviDuplicati(int[] array) {
        int lunghezzaArraySenzaDuplicati = 0;

        // Conta quanti elementi non duplicati ci sono nel array
        for (int i = 0; i < array.length; i++) {
            boolean duplicato = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                lunghezzaArraySenzaDuplicati++;
            }
        }
        // Ctrl c + ctrl p codice di sopra haha

        // nuovo array senza duplicati
        int[] risultato = new int[lunghezzaArraySenzaDuplicati];
        int indiceRisultato = 0;

        // Copia  elementi non duplicati
        for (int i = 0; i < array.length; i++) {
            boolean duplicato = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                risultato[indiceRisultato] = array[i];
                indiceRisultato++;
            }
        }

        return risultato;
    }
}





















//____________________________________________________________________________________________
//public class esercizio26 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9};
//
//        // rimuove i duplicati
//        int[] risultato = rimuoviDuplicati(array);
//
//        System.out.println(java.util.Arrays.toString(risultato));
//    }
//
//    public static int[] rimuoviDuplicati(int[] array) {
//        int lunghezzaArraySenzaDuplicati = 0;
//
//        // Conta quanti elementi non duplicati ci sono nel array
//        for (int i = 0; i < array.length; i++) {
//            boolean duplicato = false;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    duplicato = true;
//                    break;
//                }
//            }
//            if (!duplicato) {
//                lunghezzaArraySenzaDuplicati++;
//            }
//        }
//        // Ctrl c + ctrl p codice di sopra haha
//
//        // nuovo array senza duplicati
//        int[] risultato = new int[lunghezzaArraySenzaDuplicati];
//        int indiceRisultato = 0;
//
//        // Copia  elementi non duplicati
//        for (int i = 0; i < array.length; i++) {
//            boolean duplicato = false;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    duplicato = true;
//                    break;
//                }
//            }
//            if (!duplicato) {
//                risultato[indiceRisultato] = array[i];
//                indiceRisultato++;
//            }
//        }
//
//        return risultato;
//    }
//}