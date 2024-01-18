package com.devesta.i5course.designpattern.structural.composite;

import com.devesta.i5course.designpattern.structural.composite.component.Box;
import com.devesta.i5course.designpattern.structural.composite.component.composite.CompositeBox;

public class DeliveryService {
    private Box box;

    public DeliveryService() {
    }

    public void setUpOrder(Box ...boxes){
        this.box = new CompositeBox(boxes);
    }
    public double calculateOrderPrice(){
        return box.calculatePrice();
    }
}
