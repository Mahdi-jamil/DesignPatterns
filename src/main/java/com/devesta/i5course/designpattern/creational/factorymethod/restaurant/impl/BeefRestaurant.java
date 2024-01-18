package com.devesta.i5course.designpattern.creational.factorymethod.restaurant.impl;

import com.devesta.i5course.designpattern.creational.factorymethod.burger.Burger;
import com.devesta.i5course.designpattern.creational.factorymethod.burger.impl.BeefBurger;
import com.devesta.i5course.designpattern.creational.factorymethod.restaurant.Restaurant;

public class BeefRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
