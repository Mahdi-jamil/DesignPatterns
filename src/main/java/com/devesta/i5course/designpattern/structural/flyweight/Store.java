package com.devesta.i5course.designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBooks(String name, double price, String author, String category) {
        BookCategory bookCategory = BookFactory.getBookCategory(category);
        books.add(new Book(name,price,author,bookCategory));
    }

}
