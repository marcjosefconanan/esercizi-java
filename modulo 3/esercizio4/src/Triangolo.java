public class Triangolo extends Forma{

    private double x;
    private  double y;
    private  double z;

    public Triangolo(double x, double y, double z){

        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    void calcoloArea(){
        double area = x * y / z;
        System.out.println("L'area del triangolo è:" + area);
    }
}
