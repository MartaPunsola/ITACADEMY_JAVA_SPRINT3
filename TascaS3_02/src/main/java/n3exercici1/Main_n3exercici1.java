package n3exercici1;

import n3exercici1.payment.BankAccount;
import n3exercici1.payment.CreditCard;
import n3exercici1.payment.PayPal;
import n3exercici1.payment.PaymentMethod;

public class Main_n3exercici1 {
    public static void main(String[] args) {

        PaymentMethod paypal = new PayPal();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod bankAccount = new BankAccount();

        paypal.issuePayment(() -> System.out.println("Paypal payment successfully issued!"));
        creditCard.issuePayment(() -> System.out.println("Credit card payment successfully issued!"));
        bankAccount.issuePayment(() -> System.out.println("Bank account payment successfully issued!"));

    }
}
