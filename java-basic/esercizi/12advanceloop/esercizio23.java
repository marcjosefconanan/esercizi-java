//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri 
//fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.

public class StampaNumeri {

    public static void main(String[] args) {
        int valore = 8; // Cambia questo valore per vedere l'output con un limite diverso
        stampaNumeri(valore);
    }

    public static void stampaNumeri(int valoreLimite) {
        for (int i = 1; i <= valoreLimite; i++) {
            if (i == 5) {
                continue; // Salta la stampa del valore 5
            }

            System.out.println(i);
        }
    }
}
