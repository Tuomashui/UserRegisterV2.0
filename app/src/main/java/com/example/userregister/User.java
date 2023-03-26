package com.example.userregister;

public class User {
    String firstname;
    String lastname;
    String email;
    String degree;

    int photo;

    public User(String firstname, String lastname, String email, String degree,int photo){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.degree = degree;
        this.photo = photo;

    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getDegree() {
        return degree;
    }
}
