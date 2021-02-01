package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.input();
        p1.getAge();
        System.out.print(" ");
        Person p2 = new Person();
        p2.input();
        p2.getAge();
        System.out.print(" ");
        Person p3 = new Person();
        p3.input();
        p3.getAge();
        System.out.print(" ");
        Person p4 = new Person();
        p4.input();
        p4.getAge();
        System.out.print(" ");
        Person p5 = new Person();
        p5.input();
        p5.getAge();
        System.out.print(" ");
//
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
//
        p3.changeName("Bob", "Marley");
        p3.output();
    }
}
