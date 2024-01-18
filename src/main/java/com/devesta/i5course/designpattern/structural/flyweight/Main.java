package com.devesta.i5course.designpattern.structural.flyweight;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < 10000; i++) {
            store.storeBooks("Mahdi Jamil", 2024, "Mahdi ^_7", "Action");
            store.storeBooks("Test Name", 2024, "You ^_^", "Romantic");
        }
    }
}
