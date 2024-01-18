package com.devesta.i5course.designpattern.behavioral.strategy.strategy;

public interface PaymentStrategy {
    void pay(float amount);
    boolean checkValidity();
    void collectDetails();
}
