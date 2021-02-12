package com.softserve.five.Person;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    @Override
    public double Salary() {
        return 100;
    }

    @Override
    public void print() {
        System.out.println("I'm a cleaner");
    }

    public Cleaner(String name) {
        super.setName(name);
        System.out.println("Type - " + TYPE_PERSON);
    }
}
