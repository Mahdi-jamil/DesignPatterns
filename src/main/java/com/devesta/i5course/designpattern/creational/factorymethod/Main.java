package com.devesta.i5course.designpattern.creational.factorymethod;

import com.devesta.i5course.designpattern.creational.factorymethod.burger.Burger;
import com.devesta.i5course.designpattern.creational.factorymethod.restaurant.Restaurant;
import com.devesta.i5course.designpattern.creational.factorymethod.restaurant.impl.BeefRestaurant;
import com.devesta.i5course.designpattern.creational.factorymethod.restaurant.impl.VeggieBurgerRestaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new BeefRestaurant();
        Burger burger = restaurant.orderBurger();

        Restaurant restaurantV2 = new VeggieBurgerRestaurant();
        Burger burgerV2 = restaurantV2.orderBurger();


    }
}
