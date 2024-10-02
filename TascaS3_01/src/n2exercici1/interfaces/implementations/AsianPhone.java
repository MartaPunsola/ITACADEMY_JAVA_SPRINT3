package interfaces.implementations;

import interfaces.Phone;

public class AsianPhone implements Phone {
    @Override
    public void call() {
        System.out.println("You need the prefix 1569.");
    }
}
