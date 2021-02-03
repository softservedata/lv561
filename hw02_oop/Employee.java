package hw02_oop;

import java.util.Scanner;

/*
 * Practice Task.
 * Add class Employee to the project.
 * Class Employee should consist of 
 * 	- three private fields: name, rate and hours;
 * 	- static field totalSum;
 * 	- properties for acces to these fields;
 * 	- default constructor, constructor with 2 parameters(name and rate) and one with 3 parameters;
 * 	- methods:
 * 		- getSalary() - to calculate the salary of person (rate * hours)
 * 		- toString() - to output info about employee
 * 		- changeRate(int rate) - to change the rate of some employee and recalculate his salary
 * 		- getBonuses() - to calculate 10% from salary
 * In the main method() create 3 objects of Employee type. 
 * Input info about them.
 * Display total salary of all workers on the screen. 
 */

public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static int totalSum;

	Employee() {
	}

	Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;

	}

	public int getSalary(Employee e) {
		int salary = e.getRate() * e.getHours();
		System.out.println("Salary of " + e.name + ": " + salary);
		return salary;
	}

	public void changeRate(Employee e) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter updated rate: ");
		int newRate = in.nextInt();
		in.close();
		e.rate = newRate;
		System.out.println("Updated info: " + e);
		e.getSalary(e);
	}

	public int getBonuses(Employee e) {
		int bonuses = (e.getSalary(e) * 10) / 100;
		System.out.println("Bonuses for " + e.name + " = " + bonuses);
		return bonuses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public static void main(String[] args) {
		
		System.out.println("\rTask on employees:");
		Employee e1 = new Employee("Harold Bloom", 147, 40);
		System.out.println(e1);
		e1.getSalary(e1);
		e1.changeRate(e1);
		e1.getBonuses(e1);

		Employee e2 = new Employee("Emily Lorren", 134, 37);
		System.out.println(e2);
		e1.getSalary(e2);

		Employee e3 = new Employee("Rick Barren", 158, 42);
		System.out.println(e3);
		e1.getSalary(e3);

		int totalSum = (e1.getSalary(e1) + e2.getSalary(e2) + e3.getSalary(e3));
		System.out.println("Total Sum of Salaries: " + totalSum);
	}

}
