package com.percifalll._06_oop.homework2;

/**
 * Support we have a class Employee
 * Create a Developer class that extends the Employee class.
 * Creates a String field and a constructor to initialize all fields in the Developer class.
 */

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.",
                name, age, salary);
    }
}
