package com.oop.introduction;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

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
