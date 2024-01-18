package com.devesta.i5course.designpattern.behavioral.observer.subscriber.impl;

import com.devesta.i5course.designpattern.behavioral.observer.subscriber.Observer;

public class Customer implements Observer {

    private final String email;
    public Customer(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        // receive notification via email
        System.out.println("updated via email : "+email);
    }
}
