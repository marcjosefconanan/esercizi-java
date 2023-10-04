//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.

public class esercizio9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 1;
        Multiplicazione(a, b, c);

    }

    public static int Multiplicazione(int a, int b, int c) {
        int result = (a+c) * (b+c);

        System.out.println("result: " + result);
        return result;


    }
}





