package com.devesta.i5course.designpattern.behavioral.observer;

import com.devesta.i5course.designpattern.behavioral.observer.publisher.Store;
import com.devesta.i5course.designpattern.behavioral.observer.service.NotificationService;
import com.devesta.i5course.designpattern.behavioral.observer.subscriber.impl.Customer;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Store store = new Store(service);

        Customer mahdi = new Customer("jamilmahdi77@gmail.com");
        Customer test = new Customer("test-test123@hotmail.com");

        service.subscribe(mahdi);
        service.subscribe(test);

        store.newItemPromotion();
    }
}
