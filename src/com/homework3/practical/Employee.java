package com.homework3.practical;

/*
 * @author Vitalii Kryshtop
 * @version java 15.0
 *
 * 30.03.2021
 *
 *
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consist of
 *  three private fields: name, rate and hours;
 *  static field totalSum
 *  properties for access to these fields;
 *  default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
 *  methods:
 *      getSalary() - to calculate the salary of person (rate * hours)
 *      toString() - to output information about employee
 *      changeRate(int rate) - to change the rate of some employee and recalculate his salary
 *      getBonuses() – to calculate 10% from salary
 * In the method main() create 3 objects of Employee type. Input information about them.
 * Display the total salary of all workers to screen
 */

import java.util.Scanner;

public class Employee {
    /* class Employee to the project  */

    private String name;
    private int rate;
    private int hours;
    private static int totalSum;        // static field totalSum
    /* three private fields: name, rate and hours  */

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
    }

    /**
     * default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters
     */

    public int getSalary() {
        return rate * hours;
    }       // getSalary() - to calculate the salary of person (rate * hours)

    public double changeRate(int rate) {
       return this.rate;
    }      // changeRate(int rate) - to change the rate of some employee and recalculate this salary

    public int getBonuses() {
        return (getSalary() * 10) / 100;
    }        // getBonuses() – to calculate 10% from salary

    /**
     * properties for access to these fields
     */
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

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {      //toString() - to output information about employee
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {

        /**
         * In the method main() create 3 objects of Employee type. Input information about them
         */

        Employee emp1 = new Employee("Edvard", 100, 40);
        System.out.println( "First: " + emp1 + " info salary " + emp1.getSalary());
        Employee emp2 = new Employee("Tom", 110, 50);
        emp2.changeRate(60);
        System.out.println( "Second: " + emp2 + " info salary " + emp2.getSalary());
        Employee emp3 = new Employee("Sam", 90, 30);
        emp3.changeRate(100);
        System.out.println( "Second: " + emp3 + " info salary " + emp3.getSalary()
                + " info bonus " + emp3.getBonuses());

        /**
         * Display the total salary of all workers to screen
         */
        System.out.println ("TotalSum: " +  (emp1.getSalary()
                                         + emp2.getSalary() + emp3.getSalary() + emp3.getBonuses()));
    }
}
