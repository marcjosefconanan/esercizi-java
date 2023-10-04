//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca 
//la tabellina aritmetica di quel numero che dovrà essere stampata a video.

public class esercizio20 {
    public static void main(String[] args) {
        int a = 5;
        Tabella(a);
    }

    public static void Tabella(int a) {
        for (int b = 1; b <= 10; b++) {
            int ris = a * b;
            System.out.println(a + " * " + b + " = " + ris);
        }
    }
}
