package interfaces.implementations;

import interfaces.Phone;

public class EuropeanPhone implements Phone {
    @Override
    public void call() {
        System.out.println("You need the prefix 5582.");
    }
}
