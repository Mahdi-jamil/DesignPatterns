package com.devesta.i5course.designpattern.structural.adapter;

import com.devesta.i5course.designpattern.structural.adapter.application.IMyApplication;
import com.devesta.i5course.designpattern.structural.adapter.application.impl.MyApplication;
import com.devesta.i5course.designpattern.structural.adapter.application.impl.ThirdPartyServiceAdapter;
import com.devesta.i5course.designpattern.structural.adapter.format.XmlDataFormat;

public class Main {
    public static void main(String[] args) {
        //old version
        IMyApplication application = new MyApplication();
        application.displayMenu(new XmlDataFormat());

        //new version
        ThirdPartyServiceAdapter adapter = new ThirdPartyServiceAdapter();
        adapter.displayMenu(new XmlDataFormat());
    }
}
