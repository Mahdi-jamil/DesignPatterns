package com.devesta.i5course.designpattern.behavioral.strategy.context;

import com.devesta.i5course.designpattern.behavioral.strategy.service.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    private PaymentService paymentService;

    public ShoppingCart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void add(Item item ){
        items.add(item);
    }

    private void remove(Item item){
        items.remove(item);
    }

    private float calculateTotal(){
        return (float) items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void pay(){
        paymentService.processPayment(calculateTotal());
    }



}
