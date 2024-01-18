package com.devesta.i5course.designpattern.creational.builder.product;

public class CarSchema {

    private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final float weight;
    private final float height;

    public CarSchema(int id, String brand, String model, String color, float weight, float height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "CarSchema{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
