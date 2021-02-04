package com.softserve.edu.HW07;

/*-
Create a class Employee with fields
 name,
 department number,
 salary.
 Create five objects of class Employee.
 Display all employees of a certain department (enter department number in the console);
   arrange workers by the field salary in descending order.

 *
 */
public class Employee {
    private String name;
    private int dep_num;
    private double sallary;

    private Employee() {
        name = "NoName";
        dep_num = 0;
        sallary = 0;
    }

    private Employee(String name, int dep_num, double sallary) {
        this.name = name;
        this.dep_num = dep_num;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDep_num() {
        return dep_num;
    }

    public void setDep_num(int dep_num) {
        this.dep_num = dep_num;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dep_num=" + dep_num +
                ", sallary=" + sallary +
                '}';
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Maike",1,250.05) ;
        System.out.println(emp1);

    }
}
