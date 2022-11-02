package com.example.registrationappdemo;

public class User {

    public String name;
    public String date;
    public String email;

    public User() {
    }

    public User(String name, String date, String email) {
        this.name = name;
        this.date = date;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
