//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.

//Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore.

//Nel main dichiarare un oggetto di tipo Auto.

//In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi

public class Main {
    public static void main(String []args){
        Car car = new Car(5.812,"ab123ab","shelby","mustang");


        car.setPlate("cd456cd"); // cambia i nomi usando setter

        System.out.println(car); // stampa tutto.
        System.out.println(car.getModel()); // getter con privato.
    }
}


