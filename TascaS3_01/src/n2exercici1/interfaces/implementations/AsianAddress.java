package interfaces.implementations;

import interfaces.Address;

public class AsianAddress implements Address {
    @Override
    public void write() {
        System.out.println("You need to add ASIA to the postal code.");
    }
}
