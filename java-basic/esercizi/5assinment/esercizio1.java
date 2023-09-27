//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
//Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.

public class esercizio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        int resultMult = multiply(a, b);

        System.out.println("result: " + resultMult);
    }

    public static int multiply(int a, int b) {
        int result = (a + 1) * (b + 1);
        return result;
    }
}