package com.devesta.i5course.designpattern.structural.adapter.application.impl;

import com.devesta.i5course.designpattern.structural.adapter.application.IMyApplication;
import com.devesta.i5course.designpattern.structural.adapter.library.ThirdPartyService;
import com.devesta.i5course.designpattern.structural.adapter.format.JsonFormat;
import com.devesta.i5course.designpattern.structural.adapter.format.XmlDataFormat;

public class ThirdPartyServiceAdapter implements IMyApplication {
    ThirdPartyService service = new ThirdPartyService();

    public ThirdPartyServiceAdapter() {
        this.service = new ThirdPartyService();
    }

    @Override
    public void displayMenu(XmlDataFormat data) {
        JsonFormat jsonFormat = converter(data);
        service.displayMenu(jsonFormat);

    }

    @Override
    public void displayRecommendation(XmlDataFormat data) {
        JsonFormat jsonFormat = converter(data);
        service.displayRecommendation(jsonFormat);
    }

    private JsonFormat converter(XmlDataFormat dataFormat){
        //logic
        return new JsonFormat();
    }

}
