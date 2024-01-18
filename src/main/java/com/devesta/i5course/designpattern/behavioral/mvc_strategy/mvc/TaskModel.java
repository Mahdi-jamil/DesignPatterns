package com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc;

import com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    List<String> tasks = new ArrayList<>();
    SortStrategy strategy;

    public void addTask(String task) {
        tasks.add(task);
    }

    public void RemoveTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        strategy.sort(tasks);
        return tasks;
    }
}
