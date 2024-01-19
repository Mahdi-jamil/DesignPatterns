package com.devesta.i5course.designpattern.structural.decorator.decorator.impl;

import com.devesta.i5course.designpattern.structural.decorator.component.Coffee;
import com.devesta.i5course.designpattern.structural.decorator.decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0; // Add the cost of milk
    }

    @Override
    public String description() {
        return super.description() + " with Milk";
    }
}
