package com.devesta.i5course.designpattern.behavioral.visitor.element.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.element.EmployeeVisitable;

public abstract class Employee implements EmployeeVisitable {
    protected String name;
    protected float salary;

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void print();
}
