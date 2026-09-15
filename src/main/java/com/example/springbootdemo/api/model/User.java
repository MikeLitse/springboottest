package com.example.springbootdemo.api.model;

public class User {

    private String name;
    private int id;
    private int age;
    private String email;

    public User(String name, int id, int age, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }


}
