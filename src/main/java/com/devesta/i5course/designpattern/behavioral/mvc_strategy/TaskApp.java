package com.devesta.i5course.designpattern.behavioral.mvc_strategy;

import com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc.TaskController;
import com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc.TaskModel;
import com.devesta.i5course.designpattern.behavioral.mvc_strategy.mvc.TaskView;
import com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.impl.AlphabeticalSortStrategy;
import com.devesta.i5course.designpattern.behavioral.mvc_strategy.strategy.impl.DefaultSortStrategy;

public class TaskApp {
    public static void main(String[] args) {
        TaskController controller = new TaskController(new TaskModel(), new TaskView());
        controller.setSortStrategy(new DefaultSortStrategy());
        controller.addTask("-Complete assignment");
        controller.addTask("-Review meeting notes ");
        controller.addTask("-Prepare presentation");
        controller.updateView();

        controller.setSortStrategy(new AlphabeticalSortStrategy());
        controller.updateView();

        controller.addTask("-Check emails");
        controller.updateView();

    }


}
