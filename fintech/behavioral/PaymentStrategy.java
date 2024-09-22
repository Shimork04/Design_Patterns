package fintech.behavioral;

import fintech.models.Payment;

public class PaymentStrategy {
    private Payment paymentStrategy;

    public PaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        // Process the payment using the provided payment strategy
        paymentStrategy.process(amount);
        
        // Notify subscribers after processing the payment
        PaymentObserver.notifySubscribers(amount); // Corrected to use the right method signature
    }
}
