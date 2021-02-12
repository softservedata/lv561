package com.softserve.five.Employee;

public class ContractEmployee extends Employee implements PayCalc {
    private String name = "NoName";
    private String federalTaxIdmember = "0";
    private Double rate = Double.valueOf(0);

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }


    public ContractEmployee(String name, String ftn, double rate) {
        this.employeeld = "employeeld";
        this.federalTaxIdmember = ftn;
        this.rate = rate;
        this.name = name;
    }


    @Override
    public double calculatePay() {
        return getRate();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", salary= " + calculatePay() +
                '}';
    }
}

