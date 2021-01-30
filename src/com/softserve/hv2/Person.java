package com.softserve.hv2;

import java.util.Calendar;

public class Person {
	private String firstName, lastName;
	private int birthYear;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public Person() {
	}
	
	public Person(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge(int birthYear) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return birthYear - year;
	}
	
	public void output(){
		System.out.println("Person - " + firstName + " " + lastName + ", age - " + getAge(birthYear)); // сомневаюсь что мой метод заработает...
	}

	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		;
	}
}
