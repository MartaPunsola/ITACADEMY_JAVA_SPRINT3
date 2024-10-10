package factory;

import enums.Continent;

public class ContactListProducer {

    public static ContactListFactory getFactory(Continent continent) throws IllegalArgumentException {
        if(continent.equals(Continent.AMERICA)) {
            return new AmericaContactListFactory();
        } else if (continent.equals(Continent.EUROPE)) {
            return new EuropeContactListFactory();
        } else if (continent.equals(Continent.ASIA)) {
            return new AsiaContactListFactory();
        } else {
            throw new IllegalArgumentException("This is not a valid continent.");
        }
    }
}
