package com.devesta.i5course.designpattern.structural.proxy.protection;

public class DatabaseProxy implements iDatabase {

    private final RealDatabase realDatabase = new RealDatabase();

    @Override
    public void queryData(User user,String query) {
        if(user.getUserRole().equals(UserRole.ADMIN)){
            realDatabase.queryData(user,query);
        }else{
            System.out.println("denied access");
        }

    }
}
