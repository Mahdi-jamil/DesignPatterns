package com.devesta.i5course.designpattern.creational.decorator.component;

import com.devesta.i5course.designpattern.creational.decorator.component.Coffee;

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
