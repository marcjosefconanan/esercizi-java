//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno 
//della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.

public class essercizio17 {
    public static void main(String[] args) {
        int a = 10;

        switch (a) {
            case 1:
                aLunedi();
                break;
                
            case 2:
                aMartedi();
                break;
                
            case 3:
                aMercoledi();
                break;
                
            case 4:
                aGiovedi();
                break;
                
            case 5:
                aVenerdi();
                break;
                
            case 6:
                aSabato();
                break;
                
            case 7:
                aDomenica();
                break;
                
            default:
                aErrore();
        }
    }

    public static void aLunedi() {
        System.out.println("è lunedì");
    }

    public static void aMartedi() {
        System.out.println("è martedì");
    }

    public static void aMercoledi() {
        System.out.println("è mercoledì");
    }

    public static void aGiovedi() {
        System.out.println("è giovedì");
    }

    public static void aVenerdi() {
        System.out.println("è venerdì");
    }

    public static void aSabato() {
        System.out.println("è sabato");
    }

    public static void aDomenica() {
        System.out.println("è domenica");
    }

    public static void aErrore() {
        System.out.println("Errore");
    }
}
