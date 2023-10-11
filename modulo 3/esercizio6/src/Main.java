//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
//Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.


//Enum = enumerated (e una lista di cose in una colezioe)
// in java enums sono costanti non si possono cambiare e non vogliamo che cambino
//essempio dove usare enums sono : giorni della settimana, mesi del anno, ora del giorno ecc

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(1.0, 2.0);
        Triangolo triangolo = new Triangolo(1.0, 2.0, 3.0);

        Forma[] shapes = {triangolo, rettangolo};

        for (Forma x : shapes){
            x.calcoloArea();

            System.out.println("Tipo della forma: " + x.getTipo());
        }
    }
}

