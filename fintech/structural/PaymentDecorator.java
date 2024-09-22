package fintech.structural;

import fintech.models.Payment;

public abstract class PaymentDecorator extends Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    public abstract void process(double amount);
}
