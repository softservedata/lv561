package com.hw22;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int  birthYear;

    public void input(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Your name is - ");
        this.firstName = scr.nextLine();
        System.out.print("Your surname is - ");
        this.lastName = scr.nextLine();
        System.out.print("Year of your birth - ");
        this.birthYear = scr.nextInt();
        System.out.println("-----------------------------------");
    }

    public Person(){
        firstName = "Noname";
        lastName = "Enot";
        birthYear = 1990;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 1999;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge(){
        return 2021 - birthYear;
    }

   public void changeName(String fn, String ln) {
       firstName = fn;
       lastName = ln;
   }

    public void print(){
        System.out.println("Name and Surname - " + firstName + " " + lastName);
        System.out.println("Birthday - " + birthYear );
        System.out.println("Now around - " + getAge() + " years old");
        System.out.println("-----------------------------------");
    }
}
