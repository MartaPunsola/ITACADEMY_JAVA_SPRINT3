package interfaces.implementations;

import interfaces.Address;

public class AmericanAddress implements Address {
    @Override
    public void write() {
        System.out.println("You need to add USA to the postal code.");
    }
}
