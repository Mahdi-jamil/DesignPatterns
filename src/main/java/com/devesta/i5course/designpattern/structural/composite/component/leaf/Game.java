package com.devesta.i5course.designpattern.structural.composite.component.leaf;

public class Game extends Product {
    public Game(String title, Double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
