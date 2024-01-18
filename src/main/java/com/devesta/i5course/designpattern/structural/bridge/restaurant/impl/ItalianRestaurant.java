package com.devesta.i5course.designpattern.structural.bridge.restaurant.impl;

import com.devesta.i5course.designpattern.structural.bridge.Pizza.Pizza;
import com.devesta.i5course.designpattern.structural.bridge.restaurant.Restaurant;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        pizza.setSauce("Ketchup ^_^");
    }

    @Override
    protected void addToppings() {
        pizza.setToppings("Toppings");
    }

    @Override
    protected void makeCrust() {
        pizza.setCrust("Thick");
    }


}
