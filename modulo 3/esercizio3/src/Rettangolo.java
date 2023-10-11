public class Rettangolo extends Forma{

    private double x;

    private double y;

    public Rettangolo(double x, double y){
        this.y = y;
        this.x = x;
    }

    @Override
    public void calcoloArea(){
        double area = x * y;
        System.out.println("area del rettangolo: " + area);
    }
}
