package factory;

import interfaces.Address;
import interfaces.Phone;

public interface ContactListFactory {

    Phone createPhone();
    Address createAddress();


}
