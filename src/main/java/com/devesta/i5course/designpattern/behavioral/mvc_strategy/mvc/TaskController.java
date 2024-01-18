package com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc;

import com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.SortStrategy;

public class TaskController {
    TaskModel model;
    TaskView view;

    public void addTask(String task) {
        model.addTask(task);
    }

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void setSortStrategy(SortStrategy strategy) {
        model.strategy = strategy;
    }

    public void removeTask(String task) {
        model.RemoveTask(task);
    }

    public void updateView() {
        view.DisplayTasks(model.getTasks());
    }

}
