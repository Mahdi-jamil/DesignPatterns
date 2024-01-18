package com.devesta.i5course.designpattern.behavioral.visitor.visitor;

import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Designer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Developer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Manager;

public interface EmployeeVisitor {
    void visit(Manager manager);

    void visit(Developer developer);

    void visit(Designer designer);
}
