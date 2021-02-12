package com.softserve.five.Person;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    @Override
    public double Salary() {
        return 120;
    }

    @Override
    public void print() {
        System.out.println("I'm a Teacher");
    }

    public Teacher(String name) {
        super.setName(name);
        System.out.println("Type - " + TYPE_PERSON);
    }
}
