package com.softserve.edu.HW05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;

/*-
 *  
 * @author Taras Krasitskyi
 * 
 *  Create Console Application project in Java.
	Add class Person to the project.
	Class Person should consist of
	three private fields: firstName, lastName and birthYear (the birthday year) 
	
	properties for access to these fields
	
	default constructor and constructor with 2 parameters (first and last names)
	methods:
		+getAge() - to calculate the age of person
		+input() - to input information about person
		+output() - to output information about person
		+changeName(String fn, String ln) - to change the first name or/and last name of person

	+In the method main() create 5 objects of Person type and input information about them.

 * 
 */

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

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

	public Person() {
		this.firstName = "NoFirstName";
		this.lastName = "NoLastName";
		this.birthYear = 0;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = 0;

	}

	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;

	}

	public int getAge() {
		Calendar currDate = new GregorianCalendar();
		return currDate.get(Calendar.YEAR) - this.birthYear; // curren YEAR currDate.get(Calendar.YEAR)
	}

	public void input() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input information about person:");
		System.out.print("Input First Name:");
		this.firstName = sc.nextLine();
		System.out.print("Input Last Name:");
		this.lastName = sc.nextLine();
		System.out.print("Input Birth Year:");
		this.birthYear = Integer.parseInt(sc.nextLine());
		//sc.close(); // коли закривається буфер, видається помилка)) 
		

		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input information about person:");
		System.out.print("Input First Name:");
		this.firstName = br.readLine();
		System.out.print("Input Last Name:");
		this.lastName = br.readLine();
		System.out.print("Input Birth Year:");
		this.birthYear = Integer.parseInt(br.readLine());
		//br.close(); // коли закривається буфер, видається помилка)) 
*/
	}

	public void output() {
		System.out.println("Information about Person:");
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("Birth Year:" + birthYear);
		System.out.println("Age:" + this.getAge());
		System.out.println("----------------------------------");
		
	}

	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	public static void main(String[] args) throws IOException {
		/*-Person prs1 = new Person("Taras", "Krasitskyi", 1981);
		System.out.println("Person1: " + prs1);
		/*-
		 * Date curr = new Date();
		 * 
		 * System.out.println(curr);
		 * 
		 * //System.out.println(curr.getYear() + 1900);
		 * Calendar currDate = Calendar.getInstance();
		 */
		/*-Calendar currDate = new GregorianCalendar();
		System.out.println(currDate.get(Calendar.YEAR));
		System.out.println(prs1.getAge());
		
		Person prs2 = new Person();
		prs2.input();
		System.out.println("Person2: " + prs2);
		
		prs2.changeName("Ivan", "Ivanov");
		System.out.println("Person2: " + prs2);
		*/

		Person p0 = new Person();
		p0.input();

		Person p1 = new Person();
		p1.input();

		Person p2 = new Person();
		p2.input();

		Person p3 = new Person();
		p3.input();

		Person p4 = new Person();
		p4.input();

		p0.output();
		p1.output();
		p2.output();
		p3.output();
		p4.output();

		Person p5 = new Person("Petro", "Petrov", 1985);
		System.out.println(
				"This person was created by constructor Person (String firstName, string lastName, int birthYear)");
		p5.output();

		p5.changeName("Vasiliv", "Vasil");
		System.out.println("This person was modified by method changeName(String fn, String ln)");
		p5.output();

	}
}
