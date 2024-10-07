package n3exercici1.payment;

public class PayPal extends PaymentMethod {

    @Override
    public void pay() {
        System.out.print("Paying with Paypal...");
    }
}
