package com.devesta.i5course.designpattern.structural.bridge;

import com.devesta.i5course.designpattern.structural.bridge.Pizza.impl.PepperoniPizza;
import com.devesta.i5course.designpattern.structural.bridge.Pizza.impl.VeggiePizza;
import com.devesta.i5course.designpattern.structural.bridge.restaurant.impl.AmericanRestaurant;
import com.devesta.i5course.designpattern.structural.bridge.restaurant.impl.ItalianRestaurant;

public class Main {
    public static void main(String[] args) {
        AmericanRestaurant restaurant = new AmericanRestaurant(new PepperoniPizza());
        restaurant.prepareAndDeliver();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.prepareAndDeliver();
    }
}
