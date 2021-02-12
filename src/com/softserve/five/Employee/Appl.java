package com.softserve.five.Employee;

public class Appl {
    public static void main(String[] args) {
        Employee e1 = new ContractEmployee("Vasya", "FTN1", 500);
        Employee e2 = new SalariedEmployee("Olya", "SSN1", 2);
        Employee e3 = new SalariedEmployee("Kolya", "SSN2", 3);
        Employee e4 = new ContractEmployee("Masya", "FTN2", 600);
        Employee e5 = new SalariedEmployee("Petya", "SSN3", 1.5d);
        Employee e6 = new ContractEmployee("Zhenya", "FTN3", 520);
        Employee e7 = new SalariedEmployee("Antoha", "SSN4", 2.8d);
        Employee[] arr = new Employee[]{e1, e2, e3, e4, e5, e6, e7};
        Employee buf = e1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].calculatePay() < arr[j + 1].calculatePay()) {
                    buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
