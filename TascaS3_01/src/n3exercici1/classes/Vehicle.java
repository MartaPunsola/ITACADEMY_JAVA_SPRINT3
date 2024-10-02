package classes;

public abstract class Vehicle {

    private String model;
    private String manufacturer;
    private int yearOfProduction;

    public Vehicle(String model, String manufacturer, int yearOfProduction) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void start();

    public abstract void accelerate();

    public abstract void stop();

}
