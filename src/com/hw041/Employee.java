package com.hw041;

public class Employee {

//    а що буде якщо не написати паблік?
    public String name;
    public int depNum;
    public int salary;

    Employee(String name, int depNum, int salary){
        this.name = name;
        this.depNum = depNum;
        this.salary = salary;
    }

    public void print(){
        System.out.println("Name - " + name);
        System.out.println("Department number - " + depNum);
        System.out.println("Salary - " + salary + "$");
        System.out.println("----------------------------");
    }
}
