//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().

//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.


//abstract = an abstract key word can be applied in class and methods it's an extra leyer of security cuz it forces you to make use of the
// sub classes and it forces you to override certain codes.

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(1.0,2.0);
        Triangolo triangolo = new Triangolo(1.0,2.0,3.0);

        Forma[] shapes ={rettangolo, triangolo};

        for (Forma x : shapes){
            x.calcoloArea();
        }
    }
}