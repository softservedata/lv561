package com.softserve.edu;



public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSum;


    static {
        totalSum = 0;
    }
    //  Constructor creating //
    public Employee() {

    }
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;

    }
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.rate*this.hours;
    }
    // Methods
    public double getSalary() {
        return this.hours*this.rate;
    }

    public void changeRate(int rate) {
        this.rate =rate;
    }

    public double getBonuses() {
        return getSalary()*0.10;
    }

    @Override
    public String toString() {
        return "Employee "+name+"'s salary is "+rate+" dollars per hours and makes "+hours+" per month";
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Petrenko", 38,120);
        Employee employee2 = new Employee("Kuzmenko", 25,160);
        Employee employee3 = new Employee("Vasylenko", 21,180);
        Employee[] employees = new Employee[] {employee1,employee2,employee3};

        double totalSalary = 0;

        for (Employee employee: employees) {
            System.out.println("Employee "+ employee.name+" has "+employee.rate+" $ per hour and making "+employee.hours+" hours per month");
            totalSalary += employee.getSalary();
        }
        // Cross check
        if (totalSalary == totalSum) {
            System.out.println("Total workers salary: "+totalSalary);
            System.out.println("Static field is well implemented to constructor");
        }



    }
}
