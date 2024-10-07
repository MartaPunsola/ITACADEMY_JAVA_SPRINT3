package n3exercici1.payment;

import n3exercici1.Callback;

import java.util.Optional;

public abstract class PaymentMethod {

    public void issuePayment(Callback callback) {
        pay();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void pay();

}
