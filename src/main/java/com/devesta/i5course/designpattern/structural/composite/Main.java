package com.devesta.i5course.designpattern.structural.composite;

import com.devesta.i5course.designpattern.structural.composite.component.leaf.Book;
import com.devesta.i5course.designpattern.structural.composite.component.composite.CompositeBox;
import com.devesta.i5course.designpattern.structural.composite.component.leaf.Game;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setUpOrder(
                new CompositeBox(new Game("pubg",12d)),
                new CompositeBox(
                        new Book("design patterns", 454d),
                        new Game("clash royal", 12d)
                )
        );
        double price = deliveryService.calculateOrderPrice();
        System.out.println(price);
    }
}
