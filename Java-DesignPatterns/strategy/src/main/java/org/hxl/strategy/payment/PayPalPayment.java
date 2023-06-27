package org.hxl.strategy.payment;

import org.hxl.strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("The amount of: " + amount + " was payed from the PayPal...");
        System.out.println();
    }
}
