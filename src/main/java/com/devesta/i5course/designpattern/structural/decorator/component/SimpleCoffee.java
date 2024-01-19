package com.devesta.i5course.designpattern.structural.decorator.component;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 10d;
    }

    @Override
    public String description() {
        return "simple coffe";
    }
}
