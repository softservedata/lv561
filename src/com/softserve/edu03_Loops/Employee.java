package com.softserve.edu03_Loops;

import com.softserve.edu01.Person;

import java.util.*;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Random random = new Random();

            Employee employee = new Employee("Igor", random.nextInt(15), random.nextInt(4000)*1.0);
            Employee employee1 = new Employee("Olexandr", random.nextInt(15), random.nextInt(4000)*1.0);
            Employee employee2 = new Employee("Vasyl", random.nextInt(15), random.nextInt(4000)*1.0);
            Employee employee3 = new Employee("Oleg", random.nextInt(15), random.nextInt(4000)*1.0);
            Employee employee4 = new Employee("Petro", random.nextInt(15), random.nextInt(4000)*1.0);

            employees.add(employee);
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);

            Collections.sort(employees, new Comparator<Employee>() {        // Sorting throw comparator
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.getSalary() > o2.getSalary()) {
                        return -1;
                    } else if (o1.getSalary() < o2.getSalary()) {
                        return 1;
                    } else {
                        return 0;
                    }

                }
            });

            System.out.println(employees);
    }
}
