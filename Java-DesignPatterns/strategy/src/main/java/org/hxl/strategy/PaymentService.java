package org.hxl.strategy;

/**
 * Represents a service that processes orders using a specific payment strategy.
 */
public class PaymentService {
    private PaymentStrategy strategy;

    /**
     * Sets the payment strategy to be used for processing orders.
     *
     * @param paymentStrategy The payment strategy to be set.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    /**
     * Processes an order using the configured payment strategy.
     *
     * @param cost The cost of the order to be processed.
     */
    public void processOrder(int cost) {
        strategy.pay(cost);
    }
}