package com.devesta.i5course.designpattern.behavioral.visitor.element.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

public class Developer extends Employee {
    public Developer(String name, float salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println("Developer");
    }

    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        employeeVisitor.visit(this);
    }
}
