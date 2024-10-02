package commands;

import classes.Vehicle;

public class StartVehicle implements CommandVehicle{

    private Vehicle vehicle;

    public StartVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }
}
