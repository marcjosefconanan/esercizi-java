//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
// che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

public class esercizio24 {

    public static void main(String[] args) {
        int[] array = creaArray();
        int somma = calcolaSomma(array);

        System.out.println("La somma degli elementi dell'array è: " + somma);
    }

    public static int[] creaArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static int calcolaSomma(int[] array) {
        int somma = 0;

        for (int valore : array) {
            somma += valore;
        }

        return somma;
    }
}