package com.softserve.two;

public class HomeWork {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", 21, 12);
        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Vitya", 43);
        //
        System.out.println(emp1.toString());
        emp1.changeRate(33);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("Selary 1 - " + emp1.getSalary());
        System.out.println("Selary 2 - " + emp2.getSalary());
        System.out.println("Selary 3 - " + emp3.getSalary());
        System.out.println("Bonuses 1 - " + emp1.getBonuses() + "\n");
        //
        Student st1 = new Student("Kolya", 3);
        Student st2 = new Student("leha", 12);
        Student st3 = new Student("Vasya", 5);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
        System.out.println("Student st1 better than st2 - " + st1.betterStudent(st1, st2));
        System.out.println("Average rating - " + st2.getAvrRating());
    }
}
