package classes;

public class Plane extends Vehicle {

    public Plane(String model, String manufacturer, int yearOfProduction) {
        super(model, manufacturer, yearOfProduction);
    }

    @Override
    public void start() {
        System.out.println("The plane is starting to move.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("The plane has stopped.");
    }
}
