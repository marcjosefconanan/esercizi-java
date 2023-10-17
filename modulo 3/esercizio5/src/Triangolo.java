public class Triangolo extends Forma {

    private double base;
    private double altezza;
    private double lato;

    public Triangolo(double base, double altezza, double lato) {
        this.base = base;
        this.altezza = altezza;
        this.lato = lato;
    }

    @Override
    double calcolaArea() { // cambiato void a double.
        return (base * altezza) / 2; // in questo modo ?
        // cambiato x,y,z
    }
}