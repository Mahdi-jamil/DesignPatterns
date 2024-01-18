package com.devesta.i5course.designpattern.behavioral.strategy.strategy.impl;

import com.devesta.i5course.designpattern.behavioral.strategy.strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(float amount) {
        System.out.println("paying " +amount+" with credit card");
    }

    @Override
    public boolean checkValidity() {
        return true;
    }

    @Override
    public void collectDetails() {
        System.out.println("collecting via credit card");
    }
}
