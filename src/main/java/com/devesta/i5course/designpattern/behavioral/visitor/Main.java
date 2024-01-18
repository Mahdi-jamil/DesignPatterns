package com.devesta.i5course.designpattern.behavioral.visitor;

import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Designer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Developer;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Employee;
import com.devesta.i5course.designpattern.behavioral.visitor.element.impl.Manager;
import com.devesta.i5course.designpattern.behavioral.visitor.visitor.impl.IncreaseSalaryVisitor;
import com.devesta.i5course.designpattern.behavioral.visitor.visitor.impl.PrintVisitor;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("Yeo", 100f);

        manager.add(new Developer("Mahdi", 200f));
        manager.add(new Developer("zeinab", 150f));
        manager.add(new Designer("Ali", 170f));

        manager.accept(new PrintVisitor());

        System.out.println("***************");
        manager.accept(new IncreaseSalaryVisitor());
        System.out.println("***************");

        manager.accept(new PrintVisitor());
    }
}
