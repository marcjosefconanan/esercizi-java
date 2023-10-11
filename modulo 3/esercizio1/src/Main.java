//inheritance = the process where one class gets the methods and attributes of another.


//Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.

//Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.

// Prova quindi a far stampare il verso di Animale e di Gatto.

public class Main {
    public static void main(String[] args) {

        Gatto gatto = new Gatto();

        gatto.faiIlverso();

        //System.out.println(gatto.verso);
    }
}