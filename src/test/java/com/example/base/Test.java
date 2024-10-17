package com.example.base;

class User {
    private String name;
    private int age;
    public User() {

    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }




    @Override
    public String toString() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
