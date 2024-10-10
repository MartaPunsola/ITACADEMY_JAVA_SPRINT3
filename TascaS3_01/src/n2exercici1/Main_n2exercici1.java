import enums.Continent;
import factory.ContactListProducer;
import interfaces.Address;
import factory.ContactListFactory;
import interfaces.Phone;

public class Main_n2exercici1 {
    public static void main(String[] args) {


        try {
            ContactListFactory americanContactList = ContactListProducer.getFactory(Continent.AMERICA);
            Phone americanPhone = americanContactList.createPhone();
            Address americanAddress = americanContactList.createAddress();
            System.out.println("Instructions to contact someone from the United States:");
            americanPhone.call();
            americanAddress.write();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            ContactListFactory europeanContactList = ContactListProducer.getFactory(Continent.EUROPE);
            Phone europeanPhone = europeanContactList.createPhone();
            Address europeanAddress = europeanContactList.createAddress();
            System.out.println("\nInstructions to contact someone from Europe:");
            europeanPhone.call();
            europeanAddress.write();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ContactListFactory asianContactList = ContactListProducer.getFactory(Continent.ASIA);
            Phone asianPhone = asianContactList.createPhone();
            Address asianAddress = asianContactList.createAddress();
            System.out.println("\nInstructions to contact someone from Asia:");
            asianPhone.call();
            asianAddress.write();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
