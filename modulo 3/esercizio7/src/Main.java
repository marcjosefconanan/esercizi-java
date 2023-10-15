//Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico all'interno di una stringa e lo stampi.
//
//Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.


public class Main {
    public static void main(String[] args) {

        UniFinder finder = new UniFinder("Ciao, mondo!");

        System.out.println(finder.findCharacter(4)); // Stampa il carattere in posizione 4
        System.out.println(finder.findCharacter(12)); // (indice non valido)
    }
}