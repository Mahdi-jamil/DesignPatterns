package com.devesta.i5course.designpattern.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHolder{
        private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHolder.BILL_PUGH_SINGLETON;
    }

}
