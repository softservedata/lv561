package com.softserve.edu06.OOP.Employee;

public class ContractEmployee extends Employee implements Calculation {
    private String federalTaxIdmember;
    private double hourlyRate;
    private double monthHours;

    public ContractEmployee(String employeeId, String federalTaxIdmember, double hourlyRate, double monthHours) {
        this.setEmployeeId(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.monthHours = monthHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getMonthHours() {
        return monthHours;
    }

    public void setMonthHours(double monthHours) {
        this.monthHours = monthHours;
    }

    @Override
    public double calculatePay() {
        return getHourlyRate()*getMonthHours();
    }


    @Override
    public String toString() {
        return "SalariedEmployee:\nid: "+getEmployeeId()+" \nfixed salary : "+calculatePay()+" \nfederal Tax Id: "+getFederalTaxIdmember();
    }
}
