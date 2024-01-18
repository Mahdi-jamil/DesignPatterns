package com.devesta.i5course.designpattern.creational.builder.builder;

public interface Builder {
    Builder id(int id);

    Builder brand(String brand);

    Builder model(String model) ;

    Builder color(String color);

    Builder weight(float weight);

    Builder height(float height);


}
