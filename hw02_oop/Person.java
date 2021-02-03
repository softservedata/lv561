package hw02_oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/*
 * Homework Task.
 * Add class Person.
 * Class Person should consist of 
 * 	a) three private fields: firstName, lastName and birthYear
 * 	b) properties for access to these fields
 * 	c) default construction and constructor with 2 parameters (first and last names)
 * 	d) methods:
 * 		- getAge() - to calculate the age of person;
 * 		- input() - to input info about person;
 * 		- output() - to output info about person;
 * 		- changeName(String fn, String fn) - to change the first name or/and last name
 * 	In the method main() create 5 objects of Person type and input info about them
 */

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

	Person() {}

	private Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public void getAge() {
		int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
		System.out.println("Age: " + age + " yrs old");
	}

	public Person input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first name: ");
		firstName = br.readLine();
		System.out.print("Enter last name: ");
		lastName = br.readLine();
		System.out.print("Enter birth date: ");
		birthYear = Integer.parseInt(br.readLine());
		return new Person(firstName, lastName, birthYear);
	}

	public void output(Person p) throws IOException {
		System.out.println("Successfully created: " + p);
	}

	public Person changeName(Person p) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter NEW first name: ");
		String newFirstName = br.readLine();
		firstName = newFirstName;
		System.out.println("Successfully modified: " + new Person(firstName, lastName, birthYear));
		return new Person(firstName, lastName);

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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
	
	public static void main(String[] args) throws IOException {

		System.out.println("NEW PERSON:");
		Person p1 = new Person();
		p1.input();
		p1.getAge();
		p1.output(p1);
		p1.changeName(p1);

		System.out.println("\rNEW PERSON:");

		Person p2 = new Person();
		p2.input();
		p2.getAge();
		p2.output(p2);
		p2.changeName(p2);

	}

}
