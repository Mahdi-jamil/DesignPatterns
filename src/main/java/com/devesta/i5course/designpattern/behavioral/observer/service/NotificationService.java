package com.devesta.i5course.designpattern.behavioral.observer.service;

import com.devesta.i5course.designpattern.behavioral.observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<Observer> customers = new ArrayList<>();

    public void notifySubscribers(){
        customers.forEach(Observer::update);
    }

    public void subscribe(Observer observer){
        customers.add(observer);
    }
    public void unsubscribe(Observer observer){
        customers.remove(observer);
    }

}
