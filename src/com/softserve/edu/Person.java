package com.softserve.edu;

public class Person {
                            //field initialization //
    private String firstName;
    private String secondName;
    private int birthYear;
                            // default contructor
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

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Person "+ firstName+" "+secondName+" is ";
    }
}
