package com.company.practicalTask1;

public class Employee {


    //three private fields: name, rate and hours;
     private String name;
     private double rate;
     private int hours;

    //	static field totalSum
       static Object totalSum;

    //	properties for access to these fields;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHour() {
        return hours;
    }

    public void setHour(int hour) {
        this.hours = hour;
    }

    public static int getTotalSum() {
        return (int) totalSum;
    }

    public static void setTotalSum(Object totalSum) {
        Employee.totalSum = totalSum;
    }

   // default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;

    public Employee (String name, double rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee (String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    /*	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary*/
       private int salary;
       private int bonuses;

       int getSalary(){
           return (int) rate * hours;
       }

       int changeRate(int rate){
           return (int) (this.rate =  101);
       }
       int getBonuses(){ return (this.salary / 100) * 10;}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}


