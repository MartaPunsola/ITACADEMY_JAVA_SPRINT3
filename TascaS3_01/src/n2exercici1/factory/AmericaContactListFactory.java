package factory;

import interfaces.implementations.AmericanAddress;
import interfaces.implementations.AmericanPhone;
import interfaces.Address;
import interfaces.Phone;

public class AmericaContactListFactory implements ContactListFactory {
    @Override
    public Phone createPhone() {
        return new AmericanPhone();
    }

    @Override
    public Address createAddress() {
        return new AmericanAddress();
    }
}
