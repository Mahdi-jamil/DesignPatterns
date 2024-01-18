package com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc;

import java.util.List;

public class TaskView {
    public void DisplayTasks(List<String> tasks) {
        System.out.println("Tasks :");
        tasks.forEach(System.out::println);
    }
}
