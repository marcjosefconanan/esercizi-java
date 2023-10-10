//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
// che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

        // 1.
        //Scrivi un metodo che generi un array e lo riempia con numeri da 1 a 10.

        // 2.
        //Scrivi un metodo che calcoli la somma dei numeri nell'array.

        // 3.
        //Scrivi un metodo che stampi la somma a schermo.


public class esercizio24 {
    public static void main (String[] args) {
        int[] array = generaArray();
// 3.
        System.out.println("somma:" + calcolaArray(array));
    }

// 1.
        public static int[] generaArray() {
            int [] arry = new int[10];
            for (int i = 0; i < 10; i++){
                arry [i] = i + 1;
            }
            return arry;
        }
    // 2.
    public static int calcolaArray(int[] arry){
        int somma = 0;
        for (int num: arry){
            somma += num;
        }

        return somma;
    }


}

