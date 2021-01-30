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
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", 21, 12);
        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Vitya", 43);
        //
        System.out.println(emp1.toString());
        emp1.changeRate(33);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("Selary 1 - " + emp1.getSalary());
        System.out.println("Selary 2 - " + emp2.getSalary());
        System.out.println("Selary 3 - " + emp3.getSalary());
        System.out.println("Bonuses 1 - " + emp1.getBonuses());
        //

    }
}
