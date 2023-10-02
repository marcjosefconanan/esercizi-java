//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri 
//fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class Esercizio22 {

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
