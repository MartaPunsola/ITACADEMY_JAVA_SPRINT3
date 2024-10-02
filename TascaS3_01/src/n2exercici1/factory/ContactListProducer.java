package factory;

public class ContactListProducer {

    public static ContactListFactory getFactory(String continent) {
        if(continent.equalsIgnoreCase("AMERICA")) {
            return new AmericaContactListFactory();
        } else if (continent.equalsIgnoreCase("EUROPE")) {
            return new EuropeContactListFactory();
        } else if (continent.equalsIgnoreCase("ASIA")) {
            return new AsiaContactListFactory();
        }
        return null;
    }
}
