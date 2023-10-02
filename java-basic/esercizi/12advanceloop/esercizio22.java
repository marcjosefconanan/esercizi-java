//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri 
//fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class StampaNumeri {

    public static void main(String[] args) {
        int valore = 8; // Cambia questo valore per vedere l'output con un limite diverso
        stampaNumeri(valore);
    }

    public static void stampaNumeri(int valoreLimite) {
        for (int i = 1; i <= valoreLimite; i++) {
            if (i == 5) {
                System.out.println("Interrotto a causa del valore 5.");
                break; // Interrompe il ciclo quando i raggiunge 5
            }

            System.out.println(i);
        }
    }
}

//public class StampaNumeri {

//Inizia la definizione di una classe chiamata StampaNumeri.
//public static void main(String[] args) {

//Questo è il punto di ingresso del programma Java. La funzione main viene eseguita quando il programma viene avviato.
//int valore  = 8;

//Viene dichiarata una variabile valore di tipo intero e le viene assegnato il valore 8. Puoi cambiarlo per vedere l'output con un limite diverso.
//stampaNumeri(valore);

//Viene chiamato il metodo stampaNumeri e viene passato il valore di valore come argomento.
//public static void stampaNumeri(int valoreLimite) {

//Definizione del metodo stampaNumeri che prende un parametro valoreLimite di tipo intero.
//for (int i = 1; i <= valoreLimite; i++) {

//Inizia un ciclo for che parte da i = 1 e continua finché i è minore o uguale al valoreLimite. Ad ogni iterazione, i viene incrementato di uno.
//if (i == 5) {

//Verifica se i è uguale a 5.
//System.out.println("Interrotto a causa del valore 5.");

//Se i è uguale a 5, stampa il messaggio "Interrotto a causa del valore 5.".
//break;

//Dopo aver stampato il messaggio, il comando break interrompe il ciclo for, portando l'esecuzione fuori dal ciclo.
//System.out.println(i);

//Se i non è uguale a 5, stampa il valore di i.
//} (fine del ciclo for)

//Chiude il blocco del ciclo for.
//} (fine del metodo stampaNumeri)

//Chiude il blocco del metodo stampaNumeri.
//} (fine della classe StampaNumeri)

//Chiude il blocco della classe.
