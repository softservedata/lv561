package conm.homework2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() { //default constructor
    }

    public Person(String firstName, String lastName) { //constructor with 2 parameters
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input information about person   " + "first Name:");
        this.firstName = sc.nextLine();
        System.out.println("last Name: ");
        this.lastName = sc.nextLine();
        System.out.println("Subscribe birth Year: ");
        this.birthYear = sc.nextInt();
    }

    public int getAge() {
        Calendar currDate = new GregorianCalendar();
        return currDate.get(Calendar.YEAR) - this.birthYear; // curren YEAR currDate.get(Calendar.YEAR)
    }

    public void output() {
        System.out.println("Information about Person:");
        System.out.println("First Name:" + firstName);
        System.out.println("Last Name:" + lastName);
        System.out.println("Birth Year:" + birthYear);
        System.out.println("Age:" + this.getAge());
    }


    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}
