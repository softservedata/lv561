package com.softserve.edu06.OOP.Person;

public class Student extends Person {

    public static final Student TYPE_PERSON = new Student();


    public Student() {

    }

    public void print() {
        System.out.println("I'm a "+TYPE_PERSON.toString());
    }

    @Override
    public String toString() {
        return "Student class";
    }
}
