package com.company;

//import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.Scanner;

public class Person {
    private static String firstName;
    private static String lastName;
    private static int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//


    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public static int getBirthYear() {
        return birthYear;
    }

    public static void setBirthYear(int birthYear) {
        Person.birthYear = birthYear;
    }

    //
    public int getAge() {
        Calendar currentDate = new GregorianCalendar();
        return currentDate.get(Calendar.YEAR) - this.birthYear;
    }

    //
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First name: ");
        firstName = scanner.nextLine();
        System.out.print("Last name: ");
        lastName = scanner.nextLine();

        System.out.print("Birth year: ");
        birthYear = Integer.parseInt(scanner.nextLine());
    }
//
    public void output () {
        System.out.println(
                "\tData\n" +
                        "First name\t" + firstName + "\n" +
                        "Last name\t" + lastName + "\n" +
                        "Birth year\t" + birthYear);
    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
}
