package org.hxl.strategy.payment;

import org.hxl.strategy.PaymentStrategy;

/**
 * Performs a payment using the credit card payment method.
 */
public class CreditCardPayment implements PaymentStrategy {
    /**
     * Performs a payment using the credit card payment method.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("The amount of: " + amount + " was paid from the credit card.");
        System.out.println();
    }
}