package com.devesta.i5course.designpattern.behavioral.strategy;

import com.devesta.i5course.designpattern.behavioral.strategy.context.Item;
import com.devesta.i5course.designpattern.behavioral.strategy.context.ShoppingCart;
import com.devesta.i5course.designpattern.behavioral.strategy.service.PaymentService;
import com.devesta.i5course.designpattern.behavioral.strategy.strategy.impl.CreditCardStrategy;
import com.devesta.i5course.designpattern.behavioral.strategy.strategy.impl.PaypalStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.setPaymentStrategy(new CreditCardStrategy());
        ShoppingCart shoppingCart = new ShoppingCart(service);

        shoppingCart.add(new Item("toy", 100f));
        shoppingCart.add(new Item("phone", 1000f));
        shoppingCart.add(new Item("laptop", 1400f));

        shoppingCart.pay();

        System.out.println("**********************");

        service.setPaymentStrategy(new PaypalStrategy());
        shoppingCart.setPaymentService(service);
        shoppingCart.pay();
    }
}
