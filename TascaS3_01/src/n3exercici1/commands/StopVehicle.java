package commands;

import classes.Vehicle;

public class StopVehicle implements CommandVehicle{

    private Vehicle vehicle;

    public StopVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.stop();
    }
}
