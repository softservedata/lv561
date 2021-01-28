package com.softserve.two;

public class Employee {
    private String name = "NoName";
    private int rate = 0;
    private int hours = 0;
    public static int totalSum;

    public Employee() {
    }

    public Employee(String n, int r) {
        this.name = n;
        this.rate = r;
    }

    public Employee(String n, int r, int h) {
        this.name = n;
        this.rate = r;
        this.hours = h;
    }

    public int getSalary() {
        totalSum = this.hours * this.rate;
        return totalSum;
    }

    public String toString() {
        return "Name - " + name + ", Rate - " + rate + ", Hours - " + hours;
    }

    public void changeRate(int r) {
        this.rate = r;
    }

    public float getBonuses() {
        return ((float) ((float) getSalary() * 0.1));
    }
}
