package com.softserve.hv2;

public class Employee {
	private String name;
	private float rate, hours;
	private static float totalSum;
	
	static { 
		totalSum = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	
	public Employee() {
	}
	
	public Employee(String name, float rate) {
		this();
		this.name = name;
		this.rate = rate;
	}
		
	public Employee(String name, float rate, float hours) {
		this();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + (rate * hours);
	}
	
	public float getSalary() {
		return rate * hours;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate(int rate) {
		this.rate = rate;
	}
	
	public float getBonuses() {
		return (float) (0.1 * (rate * hours));
	}
	
	public float totalSum1() {
	return totalSum;
	}
}
