package com.devesta.i5course.designpattern.structural.proxy.protection;

public class User {
    private final String name;
    UserRole userRole;

    public User(UserRole userRole,String name){
        this.name=name;
        this.userRole=userRole;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public String getName() {
        return name;
    }
}
