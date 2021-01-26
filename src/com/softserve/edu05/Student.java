package com.softserve.edu05;

public class Student {
	private String name;
	private int age;
	//
	private static int count;
	
	static { // static block
		count = 0;
		System.out.println("static block done");
	}

	// Overload
	public Student() {
		count++;
		name = "";
		age = 0;
		System.out.println("Constructor Student() done");
	}

	// Overload
	public Student(String name) {
		this();
		this.name = name;
		age = 22;
		System.out.println("Constructor Student(String name) done");
	}

	// Overload
	public Student(int age) {
		this();
		name = "Petro";
		this.age = age;
		System.out.println("Constructor Student(int age) done");
	}

	// Overload
	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("Constructor Student(String name, int age) done");
	}

	public int getCount() {
		return count;
	}
	
	public String getName() {
		// Check if exist name
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		// Check name
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
