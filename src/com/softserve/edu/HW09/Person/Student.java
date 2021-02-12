package com.softserve.edu.HW09.Person;

public class Student extends Person {

	private final String typePerson = "STUDENT";

	public void print() {
		System.out.println("I am a "+typePerson+" "+ getName());

	}

	public Student() {
		setName("NoName");
		System.out.println("Create default "+typePerson);
	}

	public Student(String name) {
		setName(name);
		System.out.println("Create "+typePerson);

	}
	

	public String getTypePerson() {
		return typePerson;
	}

	@Override
	public String toString() {
		return "[" + typePerson + " - " + getName() + "]";
	}

}
