package com.softserve.edu06.OOP.Person;

public abstract class Staff extends Person {
    private double salary;



    public abstract void salary();

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double amount) {
        this.salary = amount;
    }
}
