package com.devesta.i5course.designpattern.creational.builder.builder.impl;

import com.devesta.i5course.designpattern.creational.builder.product.Car;
import com.devesta.i5course.designpattern.creational.builder.builder.Builder;

public class CarBuilder implements Builder {

    private int id;
    private String brand;
    private String model;
    private String color;
    private float weight;
    private float height;

    @Override
    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder weight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public CarBuilder height(float height) {
        this.height = height;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, weight, height);
    }

    public void clear() {
        id = 0;
        brand = null;
        model = null;
        color = null;
        weight = 0f;
        height = 0f;
    }
}
