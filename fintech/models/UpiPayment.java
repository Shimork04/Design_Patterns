package fintech.models;

import fintech.structural.TransactionLogger;

public class UpiPayment extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing UPI Payment of " + amount);
        TransactionLogger.getInstance().log("UPI Payment: " + amount);
    }
}
