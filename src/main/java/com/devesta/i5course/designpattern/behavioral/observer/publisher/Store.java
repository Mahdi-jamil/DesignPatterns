package com.devesta.i5course.designpattern.behavioral.observer.publisher;


import com.devesta.i5course.designpattern.behavioral.observer.service.NotificationService;

public class Store {
    private NotificationService service;

    public NotificationService getService() {
        return service;
    }

    public Store(NotificationService service) {
        this.service = service;
    }

    public void newItemPromotion(){
        service.notifySubscribers();
    }

}
