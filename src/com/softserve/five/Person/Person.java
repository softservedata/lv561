package com.softserve.five.Person;

public abstract class Person {
    private String name = "NoName";

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
