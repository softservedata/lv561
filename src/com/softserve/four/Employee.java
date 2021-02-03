package com.softserve.four;


import java.util.Scanner;

public class Employee {
    private String name = "NoName";
    private int department = 0;
    private int salary = 0;

    public Employee() {
    }

    public Employee(String name, int department, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';

    }


    public static void main(String[] args) {
        Employee em1 = new Employee("Kuzya", 1, 200);
        Employee em2 = new Employee("Vasja", 2, 300);
        Employee em3 = new Employee("Kolya", 1, 200);
        Employee em4 = new Employee("Sema", 3, 400);
        Employee em5 = new Employee("Vitya", 1, 200);
        Employee[] emArr = new Employee[]{em1, em2, em3, em4, em5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's number - ");
        int dep = sc.nextInt();
        Employee buf = new Employee();
        System.out.println("All employees of "+dep+" department:");
        for (int i = 0; i < emArr.length; i++) {
            if (emArr[i].department == dep) System.out.println(emArr[i].toString());
        }
        for (int i = 0; i < emArr.length-1; i++) {
            for (int j = 0; j < emArr.length - 1 - i; j++) {
                if (emArr[j].salary > emArr[j+1].salary) {
                    buf = emArr[j];
                    emArr[j] = emArr[j+1];
                    emArr[j+1] = buf;
                    System.out.println(".");
                }
            }
        }
        System.out.println("");
        for (int i = 0; i<emArr.length; i++){
            System.out.println(emArr[i].toString());
        }
    }
}
