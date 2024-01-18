package com.devesta.i5course.designpattern.creational.factorymethod.restaurant.impl;

import com.devesta.i5course.designpattern.creational.factorymethod.burger.Burger;
import com.devesta.i5course.designpattern.creational.factorymethod.burger.impl.VeggieBurger;
import com.devesta.i5course.designpattern.creational.factorymethod.restaurant.Restaurant;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
