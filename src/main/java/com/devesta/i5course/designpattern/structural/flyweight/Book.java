package com.devesta.i5course.designpattern.structural.flyweight;

public class Book {
    private String name;
    private double price;
    private String author;

    private BookCategory category;

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public BookCategory getCategory() {
        return category;
    }

    public Book(String name, double price, String author, BookCategory category) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }


}
