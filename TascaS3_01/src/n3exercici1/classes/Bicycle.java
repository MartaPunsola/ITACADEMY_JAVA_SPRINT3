package classes;

public class Bicycle extends Vehicle {

    public Bicycle(String model, String manufacturer, int yearOfProduction) {
        super(model, manufacturer, yearOfProduction);
    }

    @Override
    public void start() {
        System.out.println("The bicycle is starting to move.");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle is accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle has stopped.");
    }
}
