package org.hxl.strategy;

/**
 * Defines the contract for different payment strategies.
 */
public interface PaymentStrategy {
    /**
     * Performs the payment operation based on the implemented strategy.
     *
     * @param amount The amount to be paid.
     */
    void pay(int amount);
}