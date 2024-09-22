package fintech.behavioral;

import java.util.ArrayList;
import java.util.List;

public class PaymentObserver {
    private static List<String> subscribers = new ArrayList<>();

    public static void subscribe(String user) {
        subscribers.add(user);
    }

    public static void notifySubscribers(double amount) {
        for (String subscriber : subscribers) {
            System.out.println("Notifying " + subscriber + ": Payment of " + amount + " processed.");
        }
    }
}
