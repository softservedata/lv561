package com.hw021;

public class Employee {

     private String name;
     private int rate;
     private int hours;
     private static int totalSum = 0;

    public Employee(){
        name = "Vovka";
        rate = 100;
        hours = 6;
        totalSum = totalSum + changeRate();
    }

    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
        hours = 8;
        totalSum = totalSum + changeRate();
    }

    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + changeRate();
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public int getSalary(){
        return this.rate * this.hours;
    }

    public int changeRate() {
        return (this.rate + 10) * this.hours;
    }

    public double getBonuses(){
        return changeRate() * 0.10;
    }

    public void print(){
        System.out.println("Name - " + name);
        System.out.println("Rate - " + rate + " $/hour");
        System.out.println("Hours - " + hours + " hours/day");
        System.out.println("Salary - " + getSalary() + " $/day");
        System.out.println("Salary after changes - " + changeRate() + " $/day");
        System.out.println("10% from salary - " + getBonuses() + " $/day");
        System.out.println("-----------------------------------");
    }
}
