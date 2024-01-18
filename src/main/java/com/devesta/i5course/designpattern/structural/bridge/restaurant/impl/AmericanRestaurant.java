package com.devesta.i5course.designpattern.structural.bridge.restaurant.impl;

import com.devesta.i5course.designpattern.structural.bridge.Pizza.Pizza;
import com.devesta.i5course.designpattern.structural.bridge.restaurant.Restaurant;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        pizza.setSauce("Sauce");
    }

    @Override
    protected void addToppings() {
        pizza.setToppings(null);
    }

    @Override
    protected void makeCrust() {
        pizza.setCrust("thin");
    }
}
