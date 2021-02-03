package com.company;

import java.util.Scanner;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;
//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee() {
    }
//
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
//

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
//
    public int getSalary (Employee e) {
        int salary = e.getRate() * e.getHours();
        System.out.println("Salary of " + e.name + ": " + salary);
        return salary;
    }
//
    public void changeRate(Employee e){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new rate: ");
        int newRate = sc.nextInt();
        e.rate = newRate;
        System.out.println("New info: " + e);
        e.getSalary(e);
    }
//
public int getBonuses(Employee e) {
    int bon = (e.getSalary(e) * 10) / 100;
    System.out.println("Bonuses for " + e.name + " = " + bon);
    return bon;
}
//

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }

//
}
