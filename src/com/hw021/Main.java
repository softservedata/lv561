package com.hw021;

public class Main {

    public static void main(String[] args) {

        Employee Vovka = new Employee();
        Employee Max = new Employee("Max", 30);
        Employee Jon = new Employee("Jon", 80, 9);

        Vovka.print();
        Max.print();
        Jon.print();

        System.out.println("Salary all together - " + Employee.getTotalSum() + " $/day");
    }
}

