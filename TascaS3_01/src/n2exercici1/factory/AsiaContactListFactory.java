package factory;

import interfaces.implementations.AsianAddress;
import interfaces.implementations.AsianPhone;
import interfaces.Address;
import interfaces.Phone;

public class AsiaContactListFactory implements ContactListFactory {
    @Override
    public Phone createPhone() {
        return new AsianPhone();
    }

    @Override
    public Address createAddress() {
        return new AsianAddress();
    }
}
