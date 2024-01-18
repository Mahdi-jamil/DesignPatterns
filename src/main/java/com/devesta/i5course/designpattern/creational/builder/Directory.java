package com.devesta.i5course.designpattern.creational.builder;

import com.devesta.i5course.designpattern.creational.builder.builder.Builder;

/*
 * you should build after calling the function
 */
public class Directory {

    public void buildBMW(Builder builder) {
        builder.brand("BMW")
                .color("black")
                .height(100f)
                .weight(2005f);
    }
    public void buildMercedes(Builder builder) {
        builder.brand("Mercedes")
                .color("silver")
                .height(110f)
                .weight(1800f);
    }


}
