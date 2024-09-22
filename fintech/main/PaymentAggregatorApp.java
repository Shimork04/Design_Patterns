package fintech.main;

import fintech.models.CreditCardPayment;
import fintech.models.UpiPayment;
import fintech.behavioral.PaymentContext;
import fintech.behavioral.PaymentObserver;

public class PaymentAggregatorApp {
    public static void main(String[] args) {
        // Subscribe users
        PaymentObserver.subscribe("User1");
        PaymentObserver.subscribe("User2");

        // Payment using Credit Card
        PaymentContext creditCardContext = new PaymentContext(new CreditCardPayment());
        creditCardContext.executePayment(100.0);

        // Payment using UPI
        PaymentContext upiContext = new PaymentContext(new UpiPayment());
        upiContext.executePayment(50.0);
    }
}
