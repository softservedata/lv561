package com.softserve.edu8.String;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        if (name == null || surname == null || patronymic == null) {
            throw new NullPointerException("Entered name are empty");
        }

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public static void printInfo(Person person) {
        System.out.println("Surname and initials :"+person.getSurname()+" "+ person.getName().substring(0,1).toUpperCase()+"."+person.getPatronymic().substring(0,1).toUpperCase()+".");
        System.out.println("Name : "+person.getName());
        System.out.println("Name, middle name and last :"+person.getName()+" "+person.getPatronymic()+" "+person.getSurname());

    }
    public static Person buildPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname  = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName  = scanner.nextLine();
        Person person = new Person(name,surname,middleName);
        return person;

    }

    public static void main(String[] args) {
        Person person = Person.buildPerson();
        Person.printInfo(person);
    }

}
