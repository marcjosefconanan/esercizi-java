//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

public class esercizio26 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9};

        // rimuove i duplicati
        int[] risultato = rimuoviDuplicati(array);

        System.out.println(java.util.Arrays.toString(risultato));
    }

    public static int[] rimuoviDuplicati(int[] array) {
        int lunghezzaArraySenzaDuplicati = 0;

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
        int[] risultato = new int[lunghezzaArraySenzaDuplicati];
        int indiceRisultato = 0;

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
