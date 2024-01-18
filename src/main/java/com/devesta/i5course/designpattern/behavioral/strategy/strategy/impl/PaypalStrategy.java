package com.devesta.i5course.designpattern.behavioral.strategy.strategy.impl;

import com.devesta.i5course.designpattern.behavioral.strategy.strategy.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(float amount) {
        System.out.println("paying "+amount+" with paypal");
    }

    @Override
    public boolean checkValidity() {
        return true;
    }

    @Override
    public void collectDetails() {
        System.out.println("collecting via paypal");
    }
}
