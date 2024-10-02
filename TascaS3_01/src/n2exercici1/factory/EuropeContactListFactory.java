package factory;

import interfaces.implementations.EuropeanAddress;
import interfaces.implementations.EuropeanPhone;
import interfaces.Address;
import interfaces.Phone;

public class EuropeContactListFactory implements ContactListFactory {
    @Override
    public Phone createPhone() {
        return new EuropeanPhone();
    }

    @Override
    public Address createAddress() {
        return new EuropeanAddress();
    }
}
