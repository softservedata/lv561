package com.task2;

public class Employee {
    private String name;
    private int rating;
    private int hours;
    private static int totalSum;

    static { //static block
        setTotalSum(0);
    }

    public Employee() { //	default constructor
    }

    public Employee(String name, int rating) { // constructor with 2 parameters (name and rate)
        this.name = name;
        this.rating = rating;
    }
    //Overload
    public Employee(String name, int rating, int hours) { // constructor with 3 parameters
        this.name = name;
        this.rating = rating;
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }
    public static void setTotalSum(int totalSum) {

        Employee.totalSum = totalSum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return getRating()*getHours();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
            ", rating=" + rating +
            ", hours=" + hours +
            '}';
    }


    public double getBonuses() {
        return getSalary()*0.1;
    }


}
