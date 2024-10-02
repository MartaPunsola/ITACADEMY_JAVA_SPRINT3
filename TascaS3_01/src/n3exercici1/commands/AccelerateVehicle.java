package commands;

import classes.Vehicle;

public class AccelerateVehicle implements CommandVehicle{

    private Vehicle vehicle;

    public AccelerateVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerate();
    }
}
