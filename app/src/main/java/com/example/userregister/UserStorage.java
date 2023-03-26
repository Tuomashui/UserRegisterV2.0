package com.example.userregister;

import java.util.ArrayList;

public class UserStorage {

    ArrayList<User> users = new ArrayList<>();
    private static UserStorage singleton = null;

    private UserStorage(){
    }
    public static UserStorage getInstance(){
    if(singleton == null){
        singleton = new UserStorage();
    }
    return singleton;
    }
    public void addUser(User user){
        users.add(user);}

    public ArrayList<User> getUsers() {
        return users;
    }
}

