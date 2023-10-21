//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().

//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.

//interfacce = e come un template per una classe,
// e simile a un iheritance, pero specifica cosa dovra fare una classe o cosa deve fare una classe.
//le callsi possono avere piu di una interfacia, inheritance e limitato a un super.

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(1.0, 2.0);
        Triangolo triangolo = new Triangolo(1.0, 2.0, 3.0);

        Forma[] shapes = {rettangolo, triangolo};

        for (Forma x : shapes) {
            double area = x.calcolaArea();
            String nome = x.getNome();
            System.out.println("L'area  " + nome + " è: " + area);
        }
    }
}

