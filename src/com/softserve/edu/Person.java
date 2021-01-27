package com.softserve.edu;


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

    public void input() {

    }


    public void output() {

        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Romanyk");
        person1.birthYear = 1988;
        Person person2 = new Person("Petro","Poroshenko");
        person2.birthYear = 1965;
        Person person3 = new Person("Zhan", "Beleniyk");
        person3.birthYear = 1985;
        Person person4 = new Person("Leonid", " Kadeniyk");
        person4.birthYear = 1925;
        Person person5 = new Person("Andriy","Shevchenko");
        person5.birthYear = 1977;

        Person[] people = new Person[] {person1, person2, person3, person4, person5};
        for (Person person : people) {
            person.output();
        }

    }

    @Override
    public String toString() {
        return "Person "+ firstName+" "+secondName+" war born in " +birthYear+" and is "+getAge()+" years old";
    }
}
