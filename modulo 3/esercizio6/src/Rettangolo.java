public class Rettangolo implements Forma {
    private double x;
    private double y;
    public Rettangolo(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void calcoloArea(){
        double area = x * y;
        System.out.println("area del Rettangolo è: " + area);
    }

    @Override
    public TipoForma getTipo() {
        return TipoForma.RETTANGOLO; //non so se giusto haha
    }
}
