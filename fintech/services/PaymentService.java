package fintech.services;

import fintech.models.Payment;

public class PaymentService {
    public void processPayment(Payment payment, double amount) {
        payment.process(amount);
    }
}
