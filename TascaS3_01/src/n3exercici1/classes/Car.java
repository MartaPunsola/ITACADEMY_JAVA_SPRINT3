package classes;

public class Car extends Vehicle {

    public Car(String model, String manufacturer, int yearOfProduction) {
        super(model, manufacturer, yearOfProduction);
    }

    @Override
    public void start() {
        System.out.println("The car is starting to move.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }
}
