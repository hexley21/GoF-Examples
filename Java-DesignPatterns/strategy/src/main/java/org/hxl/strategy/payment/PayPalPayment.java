package org.hxl.strategy.payment;

import org.hxl.strategy.PaymentStrategy;

/**
 * Performs a payment using the PayPal payment method.
 */
public class PayPalPayment implements PaymentStrategy {
    /**
     * Performs a payment using the PayPal payment method.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("The amount of: " + amount + " was paid from the PayPal.");
        System.out.println();
    }
}