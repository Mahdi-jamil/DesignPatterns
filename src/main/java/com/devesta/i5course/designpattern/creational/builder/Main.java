package com.devesta.i5course.designpattern.creational.builder;

import com.devesta.i5course.designpattern.creational.builder.builder.impl.CarBuilder;
import com.devesta.i5course.designpattern.creational.builder.builder.impl.CarSchemaBuilder;
import com.devesta.i5course.designpattern.creational.builder.product.Car;
import com.devesta.i5course.designpattern.creational.builder.product.CarSchema;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car car = builder.id(1)
                .brand("brand")
                .color("red")
                .model("2024")
                .height(100.1f)
                .weight(2000f)
                        .build();


        System.out.println(car.toString());

        System.out.println("************************");

        Directory directory = new Directory();
        builder.clear();

        directory.buildBMW(builder);
        Car BMW = builder.id(2)
                .model("2023")
                .build();

        System.out.println(BMW.toString());

        System.out.println("************************");

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        directory.buildBMW(schemaBuilder);
        CarSchema schema = schemaBuilder.id(1)
                .model("2024")
                .build();

        System.out.println(schema.toString());

    }
}
