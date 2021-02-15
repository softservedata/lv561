package com.softserve.edu06.OOP.Employee;

public class SalariedEmployee extends Employee implements Calculation {
    private String socialSecurityNumber;
    private double monthSalary;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double monthSalary) {
        this.setEmployeeId(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthSalary = monthSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculatePay() {
        return getMonthSalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee:\nid: "+getEmployeeId()+" \nfixed salary : "+calculatePay()+" \nsocial security: "+getSocialSecurityNumber();
    }
}
