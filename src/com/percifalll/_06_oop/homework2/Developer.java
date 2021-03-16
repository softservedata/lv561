package com.percifalll._06_oop.homework2;

/**
 * Also in the Developer class, override the method report()
 * so that it returns a string with information about the developer, for example:
 *    Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
 * If necessary, modify the employee's class so that it meets
 * the principles of encapsulation and inheritance.
 * Create an instance of the Employee and Developer class
 * and print in the console information about them using report() method.
 */

public class Developer extends Employee{
    protected String position;

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        this.position = "none";
    }

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s Salary: \u20B4 %.2f.",
                name, age, position, salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Vova",
                18,
                1200
        );
        Developer developer = new Developer(
                "Ivan",
                21,
                "GameDev",
                2000
        );

        System.out.println("Employee:\n\t" + employee.report());
        System.out.println("Developer:\n\t" + developer.report());
    }
}
