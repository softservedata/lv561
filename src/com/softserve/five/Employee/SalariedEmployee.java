package com.softserve.five.Employee;

public class SalariedEmployee extends Employee implements PayCalc {
    private String name = "NoName";
    private String socialSecurityNumber = "0";
    private double rateHours = 0;
    private int workHours = 200;

    @Override
    public double calculatePay() {
        return rateHours * workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getRateHours() {
        return rateHours;
    }

    public void setRateHours(double rate) {
        this.rateHours = rate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String name, String ssn, double rateHours) {
        this.employeeld = "employeeld";
        this.socialSecurityNumber = ssn;
        this.rateHours = rateHours;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", salary= " + calculatePay() +
                '}';
    }
}
