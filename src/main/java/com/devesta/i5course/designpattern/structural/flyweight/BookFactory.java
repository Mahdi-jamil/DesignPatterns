package com.devesta.i5course.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookCategory> BOOK_CATEGORY_MAP = new HashMap<>();

    public static BookCategory getBookCategory(String category) {
        if (BOOK_CATEGORY_MAP.get(category) == null){
            BOOK_CATEGORY_MAP.put(category, new BookCategory(category));
        }
        return BOOK_CATEGORY_MAP.get(category);
    }
}
