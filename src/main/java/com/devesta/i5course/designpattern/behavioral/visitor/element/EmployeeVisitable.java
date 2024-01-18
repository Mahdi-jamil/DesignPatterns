package com.devesta.i5course.designpattern.behavioral.visitor.element;

import com.devesta.i5course.designpattern.behavioral.visitor.visitor.EmployeeVisitor;

public interface EmployeeVisitable {
    void accept(EmployeeVisitor employeeVisitor);
}
