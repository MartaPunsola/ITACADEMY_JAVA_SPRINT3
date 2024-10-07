package n3exercici1.payment;

public class CreditCard extends PaymentMethod {

    @Override
    public void pay() {
        System.out.print("Paying with credit card...");
    }
}
