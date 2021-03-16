package com.percifalll._05_arrays_loops.practical;

import java.util.Arrays;

public class Employee {
    private String name;
    private Department department;
    private int number;
    private double salary;

    public Employee() {
        name = "";
        department = Department.ONE;
        number = 0;
        salary = 0.0;
    }
    public Employee(String name, Department department, int number, double salary) {
        this.name = name;
        this.department = department;
        this.number = number;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setDepartment(Department department) { this.department = department; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public double getSalary() { return salary; }
    public Department getDepartment() { return department; }

    @Override
    public String toString() {
        return name + "\t" +
                department.name() + "\t" +
                number + "\t" +
                salary;
    }

    public enum Department{
        ONE, TWO, THREE, FOUR, FIVE;
    }

    public static void main(String[] args) {
        Employee[] array = new Employee[5];

        array[0] = new Employee("Vova", Department.FIVE, 0, 2253.50);
        array[1] = new Employee("Vasia", Department.FOUR, 2, 1843.0);
        array[2] = new Employee("Ivan", Department.FIVE, 1, 1203.50);
        array[3] = new Employee("Petro", Department.ONE, 3, 1894.90);
        array[4] = new Employee("Kostia", Department.TWO, 5, 1253.0);

        /**
         * all employees of a certain department - FIVE
         */
        System.out.println("Employees of the fifth department:");
        for (Employee item : array){
            if (item.department == Department.FIVE) System.out.println("\t" + item.toString());
        }

        /**
         * arrange by SALARY; desc
         */
        double[] employeesSalary = new double [array.length];
        for (int i = 0; i < array.length; i++){ employeesSalary[i] = array[i].getSalary(); }

        System.out.println("Unsorted SALARY array:\n\t" + Arrays.toString(employeesSalary));

        //bubble sort
        double temp;
        for(int i = 0; i < employeesSalary.length; i++) {
            for (int j = 1; j < (employeesSalary.length - i); j++) {
                if (employeesSalary[j] > employeesSalary[j - 1]) {
                    temp = employeesSalary[j - 1];
                    employeesSalary[j - 1] = employeesSalary[j];
                    employeesSalary[j] = temp;
                }
            }
        }

        System.out.println("Sorted SALARY array:\n\t" + Arrays.toString(employeesSalary));
    }
}
