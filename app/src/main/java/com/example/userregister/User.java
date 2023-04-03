package com.example.userregister;

import java.io.Serializable;

public class User implements Serializable {
    String firstname;
    String lastname;
    String email;
    String degree;
    String program;

    int photo;

    public User(String firstname, String lastname, String email, String degree,int photo, String program){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.degree = degree;
        this.photo = photo;
        this.program = program;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public void setProgram(String program) {this.program = program;}
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

    public String getProgram() {return program;}
}
