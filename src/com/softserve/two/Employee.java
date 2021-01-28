package com.softserve.two;

public class Employee {
    private String name = "NoName";
    private int rate = 0;
    private int hours = 0;
    public static int totalSum;
    public Employee() {}
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String n, int rate, int hours){
        this.name = n;
        this.rate = rate;
        this.hours = hours;
    }
    public int getSalary(){
        totalSum = this.hours*this.rate;
        return totalSum;
    }

}
