package com.softserve.edu.HW09.Person;

public abstract class Staff extends Person {
	private int salary;
	
	public abstract void salary() ;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
