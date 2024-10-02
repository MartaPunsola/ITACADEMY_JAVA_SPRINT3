import factory.ContactListProducer;
import interfaces.Address;
import factory.ContactListFactory;
import interfaces.Phone;

public class Main_n2exercici1 {
    public static void main(String[] args) {

        ContactListFactory americanContactList = ContactListProducer.getFactory("AMERICA");
        Phone americanPhone = americanContactList.createPhone();
        Address americanAddress = americanContactList.createAddress();
        System.out.println("Instructions to contact someone from the United States:");
        americanPhone.call();
        americanAddress.write();

        ContactListFactory europeanContactList = ContactListProducer.getFactory("EUROPE");
        Phone europeanPhone = europeanContactList.createPhone();
        Address europeanAddress = europeanContactList.createAddress();
        System.out.println("\nInstructions to contact someone from Europe:");
        europeanPhone.call();
        europeanAddress.write();

        ContactListFactory asianContactList = ContactListProducer.getFactory("ASIA");
        Phone asianPhone = asianContactList.createPhone();
        Address asianAddress = asianContactList.createAddress();
        System.out.println("\nInstructions to contact someone from Asia:");
        asianPhone.call();
        asianAddress.write();

    }
}
