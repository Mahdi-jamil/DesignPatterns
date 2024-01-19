package com.devesta.i5course.designpattern.structural.decorator.decorator.impl;

import com.devesta.i5course.designpattern.structural.decorator.component.Coffee;
import com.devesta.i5course.designpattern.structural.decorator.decorator.CoffeeDecorator;

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
