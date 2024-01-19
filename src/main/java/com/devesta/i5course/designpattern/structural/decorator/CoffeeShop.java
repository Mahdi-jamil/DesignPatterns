package com.devesta.i5course.designpattern.structural.decorator;

import com.devesta.i5course.designpattern.structural.decorator.component.Coffee;
import com.devesta.i5course.designpattern.structural.decorator.component.SimpleCoffee;
import com.devesta.i5course.designpattern.structural.decorator.decorator.impl.MilkDecorator;
import com.devesta.i5course.designpattern.structural.decorator.decorator.impl.SugarDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        // Add sugar to the coffee
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: " + sugarCoffee.cost() + ", Description: " + sugarCoffee.description());

        // Combine milk and sugar
        Coffee milkAndSugarCoffee = new MilkDecorator(new SugarDecorator(simpleCoffee));
        System.out.println("Cost: " + milkAndSugarCoffee.cost() + ", Description: " + milkAndSugarCoffee.description());
    }
}

