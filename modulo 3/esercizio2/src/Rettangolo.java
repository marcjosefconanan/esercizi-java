class Rettangolo extends Forma {
    private double x;
    private double y;

    // this. se no non va
    public Rettangolo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //override poi stampa
    @Override
    public void calcolaArea() {
        double area = x * y;
        System.out.println("area del rettangolo è: " + area);
    }
}