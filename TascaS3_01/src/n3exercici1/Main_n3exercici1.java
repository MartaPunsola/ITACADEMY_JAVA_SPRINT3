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

        Invoker invoker = new Invoker();

        System.out.println("Executing the commands for the car:");
        executeVehicleCommands(car, invoker);

        System.out.println("\nExecuting the commands for the bicycle:");
        executeVehicleCommands(bicycle, invoker);

        System.out.println("\nExecuting the commands for the plane:");
        executeVehicleCommands(plane, invoker);

        System.out.println("\nExecuting the commands for the boat:");
        executeVehicleCommands(boat, invoker);

    }

    private static void executeVehicleCommands(Vehicle vehicle, Invoker invoker) {
        invoker.addCommand(new StartVehicle(vehicle));
        invoker.addCommand(new AccelerateVehicle(vehicle));
        invoker.addCommand(new StopVehicle(vehicle));
        invoker.executeCommands();
    }
}
