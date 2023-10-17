public class Car {

    private double engine;
    private String plate;
    private String model;
    private String brand;


    /*public Car(double engine, String plate, String model, String brand){
        this.setEngine(engine);
        this.setPlate(plate);
        this.setModel(model);
        this.setBrand(brand);
    }*/

    public Car(double engine, String plate, String model, String brand){
        this.engine = engine;
        this.plate = plate;
        this.model = model;
        this.brand = brand;
    }
    //giusto così ? ho assegnato direttamente i valori ai campi all'interno del costruttore


    //questi sono i getters
    public String getModel () {
        return model;
    }

    public String getPlate () {
        return plate;
    }

    public Double getEngine () {
        return engine;
    }

    public String getBrand () {
        return brand;
    }


//questi sono i setters.

    public void setEngine(double engine) {
        this.engine = engine;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return  "Car{" +
                "engine='" + engine + '\'' +
                ", plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", brand= " + brand +
                '}';
    }

}

