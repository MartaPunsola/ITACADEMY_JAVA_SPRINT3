package interfaces.implementations;

import interfaces.Phone;

public class AmericanPhone implements Phone {

    @Override
    public void call() {
        System.out.println("You need the prefix 0025.");
    }
}
