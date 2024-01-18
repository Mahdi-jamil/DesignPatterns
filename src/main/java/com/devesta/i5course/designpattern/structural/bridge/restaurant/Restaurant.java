package com.devesta.i5course.designpattern.structural.bridge.restaurant;

import com.devesta.i5course.designpattern.structural.bridge.Pizza.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addToppings();
    protected abstract void makeCrust();

    public void prepareAndDeliver(){
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in progress");
    }

}
