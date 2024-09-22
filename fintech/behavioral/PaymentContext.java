package fintech.behavioral;

import fintech.models.Payment;

public class PaymentContext {
    private Payment paymentStrategy;

    public PaymentContext(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.process(amount);
        PaymentObserver.notifySubscribers(amount);
    }
}
