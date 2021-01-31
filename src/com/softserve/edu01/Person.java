package com.softserve.edu01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
                            //field initialization //
    private String firstName;
    private String secondName;
    private int birthYear;
                            // default constructor
    public Person () {

    }
                            // constructor with parameters
    public Person (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
                            //getAge method as years diff
    public int getAge() {
        int currentYear = 2021;
        return currentYear - this.birthYear;
    }

    public void changeName(String fn, String sn) {
        this.firstName = fn;
        this.secondName = sn;
    }

    public static Person input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = new Person();

        try {
            System.out.println("Enter firstname of your person instance: ");
            String firstName = reader.readLine();
                if (firstName.isEmpty() || firstName.equals("")) {
                System.out.println("Entered empty firstname. Re-run app");
                }
            person.firstName = firstName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
             System.out.println("Enter secondname of your person instance: ");
             String secondName = reader.readLine();
                if (secondName.isEmpty() || secondName.equals("")) {
                    System.out.println("Entered empty secondname. Re-run app");
                }
                person.secondName = secondName;
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            System.out.println("Enter date of birth of your person instance: ");
            int birthYear = Integer.parseInt(reader.readLine());
                if (birthYear == 0 || birthYear <= 1900 || birthYear > 2021) {
                System.out.println("Entered empty date of birth or wrong birth year. Re-run app");
                }
                person.birthYear = birthYear;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Person is created");
        return person;
    }


    public static void output(Person person) {

        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        Person person1 = input();
        Person person2 = input();
        Person person3 = input();
        Person person4 = input();
        Person person5 = input();

        Person[] people = new Person[] {person1, person2, person3, person4, person5};
        for (Person person : people) {
            output(person);
        }

    }

    @Override
    public String toString() {
        return "Person "+ firstName+" "+secondName+" war born in " +birthYear+" and is "+getAge()+" years old";
    }
}
