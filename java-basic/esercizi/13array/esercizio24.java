//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
// che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

public class esercizio24 {

    public static void main(String[] args) {
        int[] array = creaArray();
        int somma = calcolaSomma(array);

        System.out.println("La somma degli elementi dell'array è: " + somma);
    }

    public static int[] creaArray() { // funzione del array
        int[] array = new int[10]; // nuovo array di 10 elementi

        for (int i = 0; i < array.length; i++) { // for loop
        // i = 0; se i e minore della lunghezza di array; i = i + 1.

            array[i] = i + 1;
            //prende il elemento i e assegna il valeìore i + 1 iniziando da 0. 
        }

        return array; // fatto tutto questo restituisci il valore di "array"
    }

    public static int calcolaSomma(int[] array) { //calcola la somma degli elementi di un array.
        int somma = 0; //accumula la somma elementi array 

        for (int valore : array) { // for each 
        // valore sarà uguale al primo elemento dell'array, poi al secondo, e così via.
            somma += valore; // valore corrente + totale
            
        }

        return somma; //somma
    }
}