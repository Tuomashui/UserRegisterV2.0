package com.example.userregister;

import android.content.Context;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;


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
        users.add(user);
    }


    public ArrayList<User> getUsers() {
        return users;
    }

    public void loadUsers(Context context){
        try {
                ObjectInputStream userLoader = new ObjectInputStream(context.openFileInput("user.data"));
                users = (ArrayList<User>) userLoader.readObject();
                userLoader.close();
        }catch (IOException | ClassNotFoundException e) {
                System.out.println("Käyttäjien lukeminen epäonnistui");
                e.printStackTrace();
        }
    }

    public void saveUsers(Context context) {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("user.data", Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        } catch (IOException e) {
            System.out.println("Käyttäjien tallentaminen epäonnistui");
            e.printStackTrace();
        }
    }
}

