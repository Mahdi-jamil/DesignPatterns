package com.devesta.i5course.designpattern.structural.adapter.application.impl;

import com.devesta.i5course.designpattern.structural.adapter.application.IMyApplication;
import com.devesta.i5course.designpattern.structural.adapter.format.XmlDataFormat;

public class MyApplication implements IMyApplication {
    @Override
    public void displayMenu(XmlDataFormat data) {
        // logic
    }

    @Override
    public void displayRecommendation(XmlDataFormat data) {
        // logic
    }
}
