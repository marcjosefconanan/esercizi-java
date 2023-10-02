//Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere 
//e stampi tutti i numeri naturali in ordine inverso (Quindi se passo il punto di partenza a 6 e gli 
//dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).

public class Esercizio21 {
    public static void main(String[] args) {
        stampa(6, 3);
    }

    public static void stampa(int inizio, int numSum) {
        for (int i = inizio; i > inizio - numSum; i--) {
            System.out.print(i + " ");
        }
    }
}