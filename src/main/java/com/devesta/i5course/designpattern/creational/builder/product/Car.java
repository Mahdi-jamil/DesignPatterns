package com.devesta.i5course.designpattern.creational.builder.product;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private float weight;
    private float height;

    public Car(int id, String brand, String model, String color, float weight, float height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


}
