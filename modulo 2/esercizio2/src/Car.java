public class Car {

    private final double engine;
    private final String plate;
    private final String brand;

    public Car(double engine, String plate, String brand){
        this.engine = engine;
        this.plate = plate;
        this. brand = brand;
    }
    public String getPlate () {
        return plate;
    }

    @Override
    public String toString() {
        return  "Car{" +
                "engine='" + engine + '\'' +
                ", plate='" + plate + '\'' +
                ", brand= " + brand +
                '}';
    }

}
