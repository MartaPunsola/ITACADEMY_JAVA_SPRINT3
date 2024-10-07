package n3exercici1.payment;

public class BankAccount extends PaymentMethod {

    @Override
    public void pay() {
        System.out.print("Paying with bank account...");
    }
}
