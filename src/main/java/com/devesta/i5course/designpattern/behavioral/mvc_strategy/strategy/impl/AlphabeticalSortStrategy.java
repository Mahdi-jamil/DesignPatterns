package com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.impl;

import com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.SortStrategy;

import java.util.List;

public class AlphabeticalSortStrategy implements SortStrategy {

    @Override
    public void sort(List<String> tasks) {
        tasks.sort(String.CASE_INSENSITIVE_ORDER);
    }
}
