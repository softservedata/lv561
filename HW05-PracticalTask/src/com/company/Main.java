package com.company;


public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Harry Potter", 54,34);
        System.out.println(e1);
        e1.getSalary(e1);
        e1.changeRate(e1);
        e1.getBonuses(e1);
//
        Employee e2 = new Employee("Hermione Granger", 134, 55);
        System.out.println(e2);
        e2.getSalary(e2);
        e2.changeRate(e2);
        e2.getBonuses(e2);
//
        Employee e3= new Employee("Ronald Weasley", 49, 30);
        System.out.println(e3);
        e3.getSalary(e3);
        e3.changeRate(e3);
        e3.getBonuses(e3);
//
        int totalSum = (e1.getSalary(e1) + e2.getSalary(e2) + e3.getSalary(e3));
        System.out.println("Total sum of Salaries: " + totalSum);


    }
}
