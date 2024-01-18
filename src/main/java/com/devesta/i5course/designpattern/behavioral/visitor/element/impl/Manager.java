package com.devesta.i5course.designpattern.behavioral.visitor.element.impl;

import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

import java.util.LinkedList;

public class Manager extends Employee{

    private final LinkedList<Employee> employees = new LinkedList<>();
    public Manager(String name, float salary) {
        super(name, salary);
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        employeeVisitor.visit(this);
        employees.forEach(e->e.accept(employeeVisitor));
    }

    @Override
    public void print() {
        System.out.println("Manager");
    }
}
