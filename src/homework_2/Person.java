package homework_2;

import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        Calendar currentYear = new GregorianCalendar();

        return currentYear.get(Calendar.YEAR) - birthYear;
    }

    public static Person input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fName = null;
        String lName = null;
        int bYear = 0;

        try {
            System.out.println("Введіть фамілію: ");
            fName = reader.readLine();

            System.out.println("Введіть ім'я: ");
            lName = reader.readLine();

            System.out.println("Введіть рік народження: ");
            bYear = Integer.parseInt(reader.readLine());
        }
        catch (IOException e){
            System.out.println("Дані введені некорректно!");
        }

        return new Person(fName, lName, bYear);
    }

    public void changeName(String fn, String ln){
        this.firstName = ln;
        this.lastName = fn;
    }

    public void output(){
        System.out.println("Фамілія: " + firstName);
        System.out.println("Ім'я: " + lastName);
        System.out.println("Рік народження: " + birthYear);
        System.out.println("Вік: " + getAge() + " років");
        System.out.println("____________________________");
    }

    public static void main(String[] args) {
        Person person1 = input();
        Person person2 = input();
        Person person3 = input();
        Person person4 = input();
        Person person5 = input();

        person1.changeName(person1.firstName, person1.lastName);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
