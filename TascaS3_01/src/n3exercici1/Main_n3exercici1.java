import classes.*;
import commands.AccelerateVehicle;
import commands.Invoker;
import commands.StartVehicle;
import commands.StopVehicle;

public class Main_n3exercici1 {
    public static void main(String[] args) {

        Car car = new Car("FG500", "Volvo", 1950);
        Bicycle bicycle = new Bicycle("SuperFast28", "Garmin", 2015);
        Plane plane = new Plane("A320", "Airbus", 2016);
        Boat boat = new Boat("Wave89", "Bavaria", 2020);

        StartVehicle startCar = new StartVehicle(car);
        AccelerateVehicle accelerateCar = new AccelerateVehicle(car);
        StopVehicle stopCar = new StopVehicle(car);

        StartVehicle startBicycle = new StartVehicle(bicycle);
        AccelerateVehicle accelerateBicycle = new AccelerateVehicle(bicycle);
        StopVehicle stopBicycle = new StopVehicle(bicycle);

        StartVehicle startPlane = new StartVehicle(plane);
        AccelerateVehicle acceleratePlane = new AccelerateVehicle(plane);
        StopVehicle stopPlane = new StopVehicle(plane);

        StartVehicle startBoat = new StartVehicle(boat);
        AccelerateVehicle accelerateBoat = new AccelerateVehicle(boat);
        StopVehicle stopBoat = new StopVehicle(boat);

        Invoker invoker = new Invoker();

        System.out.println("Executing the commands for the car:");
        invoker.addCommand(startCar);
        invoker.addCommand(accelerateCar);
        invoker.addCommand(stopCar);
        invoker.executeCommands();

        System.out.println("\nExecuting the commands for the bicycle:");
        invoker.addCommand(startBicycle);
        invoker.addCommand(accelerateBicycle);
        invoker.addCommand(stopBicycle);
        invoker.executeCommands();

        System.out.println("\nExecuting the commands for the plane:");
        invoker.addCommand(startPlane);
        invoker.addCommand(acceleratePlane);
        invoker.addCommand(stopPlane);
        invoker.executeCommands();

        System.out.println("\nExecuting the commands for the boat:");
        invoker.addCommand(startBoat);
        invoker.addCommand(accelerateBoat);
        invoker.addCommand(stopBoat);
        invoker.executeCommands();


    }
}
