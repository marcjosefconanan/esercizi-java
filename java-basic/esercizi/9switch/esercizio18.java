//Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica 
//il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).

//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.


public class esercizio18 {
    public static void main(String[] args) {
        char a = '*'; 

        String result = aEun(a);

        System.out.println(result);
    }

    public static String aEun(char Operazione) {
        switch (Operazione) {
            case '+':
                return "addizione";
            case '-':
                return "sottrazione";
            case '*':
                return "moltiplicazione";
            case '/':
                return "Odivisione";
            default:
                return "Errore: non riconosciuta";
        }
    }
}