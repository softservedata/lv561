package com.softserve.five.Person;

public class Student extends Person {
    public Student(String name) {
        super.setName(name);
    }
    @Override
    public void print() {
        System.out.println("I'm a Student");

    }
}
