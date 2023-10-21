public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double calcolaArea() { // cambiato void a double
        return base * altezza;
    }

    @Override
    String getNome() {
        return "Rettangolo";
    }
}
