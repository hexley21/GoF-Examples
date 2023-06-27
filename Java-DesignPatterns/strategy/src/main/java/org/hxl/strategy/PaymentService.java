package org.hxl.strategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void processOrder(int cost) {
        strategy.pay(cost);
    }

}
