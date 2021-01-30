package com.softserve.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    //    public Person(String fn, String ln, int by) {
//        firstName = fn;
//        lastName = ln;
//        birthYear = by;
//    }
    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public static Person input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person per = new Person();

        try {
            System.out.print("Enter first name - ");
            String fn = br.readLine();
            per.firstName = fn;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.print("Enter last name - ");
            String ln = br.readLine();
            per.lastName = ln;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.print("Enter birth year - ");
            int by = Integer.parseInt(br.readLine());
            per.birthYear = by;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return per;
    }

    public static void output(Person per) {
        System.out.println(per.toString());
    }

    public void changeName(Person per, String fn, String ln) {
        System.out.print("Enter obj, first name and second name");
        per.firstName = fn;
        per.lastName = ln;
    }

    public String toString() {
        return "First name - "+ firstName+", Last name - "+lastName+", birth year - " +birthYear+", age -  "+getAge();
    }

    public static void main(String[] args) {
        Person per1 = input();
        Person per2 = input();
        Person per3 = input();
        Person per4 = input();
        Person per5 = input();

        output(per1);
        output(per2);
        output(per3);
        output(per4);
        output(per5);
//        System.out.println(per1.getAge());

    }

}

