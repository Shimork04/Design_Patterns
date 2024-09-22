package fintech.models;

import fintech.structural.TransactionLogger;

public class CreditCardPayment extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
        TransactionLogger.getInstance().log("Credit Card Payment: " + amount);
    }
}
