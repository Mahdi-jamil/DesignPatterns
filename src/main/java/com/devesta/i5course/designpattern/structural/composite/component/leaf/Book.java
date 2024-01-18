package com.devesta.i5course.designpattern.structural.composite.component.leaf;

public class Book extends Product {

    public Book(String title, Double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
