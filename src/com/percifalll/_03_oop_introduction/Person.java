package com.percifalll._03_oop_introduction;


import java.time.LocalDate;
import java.util.Scanner;

/**
 * Add class Person to the project.
 * Class Person should consist of
 *  three private fields: firstName, lastName and birthYear (the birthday year)
 *  properties for access to these fields
 *  default constructor and constructor with 2 parameters (first and last names)
 * methods:
 *  getAge() - to calculate the age of person
 *  input() - to input information about person
 *  output() - to output information about person
 *  changeName(String fn, String ln) - to change the first name or/and last name of person
 *
 * In the method main() create 5 objects of Person type and input information about them.
 */

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person(){
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //  ***
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    //  ***
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    //
    //  ***
    //
    public int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First name:");
        firstName = scanner.nextLine();
        System.out.print("Last name:");
        lastName = scanner.nextLine();

        System.out.print("Birth year:");
        birthYear = Integer.parseInt(scanner.nextLine());
    }

    public void output(){
        System.out.println(
                "\tData\n" +
                        "First name\t" + firstName + "\n" +
                        "Last name\t" + lastName + "\n" +
                        "Birth year\t" + birthYear

        );
    }

    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String [] args){
        Person
                a1 = new Person(),
                a2 = new Person(),
                a3 = new Person(),
                a4 = new Person(),
                a5 = new Person();

        a1.input();
        System.out.print("\n\t***\n\n");
        a2.input();
        System.out.print("\n\t***\n\n");
        a3.input();
        System.out.print("\n\t***\n\n");
        a4.input();
        System.out.print("\n\t***\n\n");
        a5.input();
    }
}
