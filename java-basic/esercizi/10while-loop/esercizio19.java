//Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero 
//come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)

public class esercizio19 {
    public static void main(String[] args) {
        int a = 5; 
        int sum = calSum(a);
        System.out.println("La somma è: " + sum);
    }

    public static int calSum(int limite) {
        int sum = 0;
        int b = 1;

        while (b < limite) {
            sum += b;
            b++;
        }

        return sum;
    }
}