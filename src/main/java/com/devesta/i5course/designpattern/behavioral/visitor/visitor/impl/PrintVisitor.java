package com.devesta.i5course.designpattern.behavioral.visitor.visitor.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Designer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Developer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Manager;
import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

public class PrintVisitor implements EmployeeVisitor {
    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + " " + manager.getSalary());
    }

    @Override
    public void visit(Developer developer) {
        System.out.println(developer.getName() + " " + developer.getSalary());
    }

    @Override
    public void visit(Designer designer) {
        System.out.println(designer.getName() + " " + designer.getSalary());
    }
}
