//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.


//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(1.0, 2.0);

        rettangolo.calcolaArea();//stampa area rettangolo
    }
}