package com.softserve.edu06.OOP.Person;

public class Teacher extends Staff {

    public static final Teacher TYPE_PERSON;

    static {
        TYPE_PERSON = new Teacher(20000.0);
    }

    public Teacher(double amount) {

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
        return "Teacher class";
    }
}
