package com.devesta.i5course.designpattern.creational.builder.builder.impl;

import com.devesta.i5course.designpattern.creational.builder.product.CarSchema;
import com.devesta.i5course.designpattern.creational.builder.builder.Builder;

public class CarSchemaBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private float weight;
    private float height;

    @Override
    public CarSchemaBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }
    @Override
    public CarSchemaBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemaBuilder weight(float weight) {
        this.weight = weight;
        return this;
    }
    @Override
    public CarSchemaBuilder height(float height) {
        this.height = height;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(id, brand, model, color, weight, height);
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
