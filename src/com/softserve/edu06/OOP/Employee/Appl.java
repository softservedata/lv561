package com.softserve.edu06.OOP.Employee;

import java.sql.SQLSyntaxErrorException;

public class Appl {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("YV120488","3224521456",2300.00);
        Employee employee2 = new SalariedEmployee("MS020867","3491285020", 2543.57);
        Employee employee3 = new ContractEmployee("OS020167","LV12345",12.4, 135);
        Employee employee4= new ContractEmployee("RO250391","KY34567", 13.43, 145);


        int number = 0;
        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4};
        for (Employee employee: employees) {
            ++number;
            System.out.println("Employee # "+number);
            System.out.println(employee.toString());
            System.out.println("******************");
        }
    }
}
