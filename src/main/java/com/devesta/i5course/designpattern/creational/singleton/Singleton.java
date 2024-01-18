package com.devesta.i5course.designpattern.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    public Singleton(String data) {
        this.data = data;
    }


    /**
     * 1.create local var result because access volatile instance is expensive
     * 2.synchronized block to prevent accessing multiple threads
     * 3.double-checking because of partially creating make instance not null but not completed !!
     */
    public static Singleton getInstance(String data) {
        Singleton result = instance;

        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
