package com.homework3.homework;

import java.util.Scanner;

/**
 * @autor Vitalii Kryshtop
 * @version java 15.0
 * <p>
 * change 31.03.2021
 */

/*
 * Create Console Application project in Java.
 *  Add class Person to the project.
 *  Class Person should consist of
 *  three private fields: firstName, lastName and birthYear (the birthday year)
 *  properties for access to these fields
 *  default constructor and constructor with 2 parameters (first and last names)
 *  methods:
 *      getAge() - to calculate the age of person
 *      input() - to input information about person
 *      output() - to output information about person
 *      changeName(String fn, String ln) - to change the first name or/and last name of person
 *
 * In the method main() create 5 objects of Person type and input information about them.
 */

class Person {
    // Add class Person to the project.

    private String firstName;
    private String lastName;
    private int birthYear;
    //three private fields: firstName, lastName and birthYear (the birthday year)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    /*
     * properties for access to these fields
     */

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.birthYear = 0;
    }   //default constructor

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }   //and constructor with 2 parameters (first and last names)

    public int getAge() {
        return 2021 - this.birthYear;
    }   //getAge() - to calculate the age of person

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input information about person" + "\n" + "Subscribe first Name:");
        this.firstName = sc.nextLine();
        System.out.println("\"Subscribe last Name:\"");
        this.lastName = sc.nextLine();
        System.out.println("\"Subscribe birth Year:\"");
        this.birthYear = sc.nextInt();
    }   //input() - to input information about person

    public void output() {
        System.out.println("First Name - " + firstName + "\n" +
                "Last Name - " + lastName + "\n" +
                "Age - " + this.getAge());
    }   // output() - to output information about person

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }   //changeName(String fn, String ln) - to change the first name or/and last name of person

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }


    public static void main(String[] args) {
        /**
         * In the method main() create 5 objects of Person type and input information about them.
         */

        System.out.println("First person: ");
        Person firstPerson = new Person();
        firstPerson.input();

        firstPerson.output();


        System.out.println("second person: ");
        Person secondPerson = new Person();
        secondPerson.input();
        secondPerson.output();

        System.out.println("third person: ");
        Person thirdPerson = new Person();
        thirdPerson.input();
        thirdPerson.output();

        System.out.println("forth person: ");
        Person fourthPerson = new Person();
        fourthPerson.input();
        fourthPerson.output();

        System.out.println("Fifth person: ");
        Person fifthPerson = new Person();
        fifthPerson.input();
        fifthPerson.output();


    }
}
