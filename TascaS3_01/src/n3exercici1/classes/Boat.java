package classes;

public class Boat extends Vehicle {

    public Boat(String model, String manufacturer, int yearOfProduction) {
        super(model, manufacturer, yearOfProduction);
    }

    @Override
    public void start() {
        System.out.println("The boat is starting to move.");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat is accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("The boat has stopped.");
    }
}
