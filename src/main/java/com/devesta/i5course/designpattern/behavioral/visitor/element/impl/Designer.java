package com.devesta.i5course.designpattern.behavioral.visitor.element.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

public class Designer extends Employee{
    public Designer(String name, float salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println("Designer");
    }

    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        employeeVisitor.visit(this);
    }
}
