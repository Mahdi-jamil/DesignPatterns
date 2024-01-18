package com.devesta.i5course.designpattern.structural.proxy.protection;

public class Client {

    public static void main(String[] args) {
        User user1 = new User(UserRole.ADMIN, "Mahdi");
        User user2 = new User(UserRole.USER, "Ali");

        DatabaseProxy proxy = new DatabaseProxy();
        proxy.queryData(user1,"select * from table1");
        proxy.queryData(user2, "select * from table1");

    }

}
