package fintech.creational;

import fintech.models.Payment;
import fintech.models.CreditCardPayment;
import fintech.models.UpiPayment;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "upi":
                return new UpiPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}