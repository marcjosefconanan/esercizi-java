//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice 
//riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga

public class esercizio27 {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}}; 

        int somma = sommaPrimaRiga(matrice); 
        // Chiama il metodo per ottenere la somma della prima riga.

        System.out.println("Somma della prima riga: " + somma); 
    
    }

    public static int sommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int elemento : matrice[0]) { // ripete attraverso la prima riga.
            somma += elemento; 
            
            // Aggiungi ogni elemento alla somma.
        }

        return somma; 
        
    }
}