public class Rettangolo extends Forma{

    private double x;
    private  double y;

    public Rettangolo(double x, double y){

        this.x = x;
        this.y = y;
    }
    @Override
    void calcoloArea(){
        double area = x * y;
        System.out.println("L'area del rettangolo è:" + area);
    }
}
