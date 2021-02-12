package com.softserve.edu.HW09.Person;

public class Teacher extends Staff {
	private String typePerson = "TEACHER";

	public Teacher() {
		setName("NoName");
		setSalary(0);
		System.out.println("Create default " + typePerson);
	}

	public Teacher(String name, int salary) {
		setName(name);
		setSalary(salary);
		System.out.println("Create " + typePerson);

	}
	

	public String getTypePerson() {
		return typePerson;
	}

	//@Override
	public void salary() {
		System.out.println(typePerson + " " + getName() + ", salary - " + getSalary());

	}

	public void print() {
		System.out.println("I am a " + typePerson + " " + getName());

	}

	@Override
	public String toString() {
		return "[" + typePerson + " - " + getName() + ", salary - " + getSalary() + "]";
	}
	


}
