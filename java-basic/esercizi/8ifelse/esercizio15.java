//Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi 
//"Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
//Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

public class esercizio15 {
    public static void main(String[] args) {
        stampa(1, 100);
    }

    public static void stampa(int inizio, int fine) {
        if (inizio <= fine) {
            
            if (inizio % 3 == 0 && inizio % 5 == 0) {
                System.out.println("FizzBuzz");
                
            } else if (inizio % 3 == 0) {
                System.out.println("Fizz");
                
            } else if (inizio % 5 == 0) {
                System.out.println("Buzz");
                
            } else {
                System.out.println(inizio);
            }
            
            stampa(inizio + 1, fine);
        }
    }
}