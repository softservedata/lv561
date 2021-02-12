package com.softserve.edu06.OOP.Person;

public class Cleaner extends Staff {
    public static final Cleaner TYPE_PERSON;

    static {
        TYPE_PERSON = new Cleaner(12000.0);
    }

    public Cleaner(double amount) {

        this.setSalary(amount);
    }


    public void print() {
        System.out.println("I'm a "+TYPE_PERSON.toString());
    }

    @Override
    public void salary() {
        System.out.println(this.getSalary());
    }

    @Override
    public String toString() {
        return "Cleaner class";
    }
}
