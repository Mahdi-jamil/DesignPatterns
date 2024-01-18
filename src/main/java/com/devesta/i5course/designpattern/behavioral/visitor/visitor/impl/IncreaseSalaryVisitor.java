package com.devesta.i5course.designpattern.behavioral.visitor.visitor.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Designer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Developer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Manager;
import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

public class IncreaseSalaryVisitor implements EmployeeVisitor {
    @Override
    public void visit(Manager manager) {
        manager.setSalary((float) (manager.getSalary() * 1.4));
    }


    @Override
    public void visit(Developer developer) {
        developer.setSalary((float) (developer.getSalary() * 1.3));
    }

    @Override
    public void visit(Designer designer) {
        designer.setSalary((float) (designer.getSalary() *1.2));
    }
}
