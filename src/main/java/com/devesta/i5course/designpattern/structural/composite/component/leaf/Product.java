package com.devesta.i5course.designpattern.structural.composite.component.leaf;

import com.devesta.i5course.designpattern.structural.composite.component.Box;

public abstract class Product implements Box {
    protected String title;
    protected Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

}
