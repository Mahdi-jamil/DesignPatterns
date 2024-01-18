package com.devesta.i5course.designpattern.structural.bridge.Pizza.impl;

import com.devesta.i5course.designpattern.structural.bridge.Pizza.Pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("adding "+sauce);
        System.out.println("adding" + toppings );
        System.out.println("adding "+crust);
    }

    @Override
    public void qualityCheck() {
        System.out.println("check check");
    }
}
