//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno 
//della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.

public class esercizio17 {
    public static void main(String[] args) {
        int a = 3; 

        String messaggio = Giorni(a);

        System.out.println(messaggio);
    }

    public static String Giorni(int day) {
        switch (day) {
            case 1:
                return "è lunedì";
            case 2:
                return "è martedì";
            case 3:
                return "è mercoledì";
            case 4:
                return "è giovedì";
            case 5:
                return "è venerdì";
            case 6:
                return "è sabato";
            case 7:
                return "è domenica";
            default:
                return "Errore";
        }
    }
}