package org.hxl.strategy;

import org.hxl.strategy.payment.CreditCardPayment;
import org.hxl.strategy.payment.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        int purchasePrice = 10;

        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.processOrder(purchasePrice);

        paymentService.setPaymentStrategy(new PayPalPayment());

        paymentService.processOrder(10);
    }
}