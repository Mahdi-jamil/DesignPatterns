package com.devesta.i5course.designpattern.structural.proxy.protection;

public class RealDatabase implements iDatabase{
    @Override
    public void queryData(User user,String query) {
        System.out.println("connection done by "+user.getName());
        System.out.println("processing "+query);
        System.out.println("close connection");
    }
}
