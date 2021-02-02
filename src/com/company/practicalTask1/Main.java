package com.company.practicalTask1;

public class Main {

    public static void main(String[] args) {
        Employee firstPerson = new Employee("Victor", 122, 22);
        Employee secondPerson = new Employee("Oleg", 127, 13);
        Employee thirdPerson = new Employee("Dima", 77, 10);

        System.out.println("Employee first: " + firstPerson);
        System.out.println("Employee second: " + secondPerson);
        System.out.println("Employee third: " + thirdPerson);
        System.out.println(Employee.getTotalSum());
        }
}
