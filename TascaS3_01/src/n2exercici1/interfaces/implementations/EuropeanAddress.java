package interfaces.implementations;

import interfaces.Address;

public class EuropeanAddress implements Address {
    @Override
    public void write() {
        System.out.println("You need to add EUR to the postal code.");
    }
}
