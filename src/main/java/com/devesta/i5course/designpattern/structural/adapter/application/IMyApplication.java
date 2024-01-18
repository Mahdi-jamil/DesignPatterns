package com.devesta.i5course.designpattern.structural.adapter.application;

import com.devesta.i5course.designpattern.structural.adapter.format.XmlDataFormat;

public interface IMyApplication {
    void displayMenu(XmlDataFormat data);
    void displayRecommendation(XmlDataFormat data);
}
