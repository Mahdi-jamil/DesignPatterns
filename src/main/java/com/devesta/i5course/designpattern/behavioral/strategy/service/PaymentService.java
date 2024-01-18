package com.devesta.i5course.designpattern.behavioral.strategy.service;

import com.devesta.i5course.designpattern.behavioral.strategy.strategy.PaymentStrategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public void processPayment(float amount) {
        paymentStrategy.collectDetails();
        if (paymentStrategy.checkValidity()) {
            paymentStrategy.pay(amount);
        }
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        paymentStrategy = strategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
}
