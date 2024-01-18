package com.devesta.i5course.designpattern.creational.factorymethod.restaurant;

import com.devesta.i5course.designpattern.creational.factorymethod.burger.Burger;

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();

}
