package com.devesta.i5course.designpattern.creational.decorator.decorator.impl;

import com.devesta.i5course.designpattern.creational.decorator.component.Coffee;
import com.devesta.i5course.designpattern.creational.decorator.decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Add the cost of sugar
    }

    @Override
    public String description() {
        return super.description() + " with Sugar";
    }
}
