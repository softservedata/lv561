package com.softserve.edu.HW05;

/**
 * 
 * @author Taras Krasitskyi
 * 
 *         Homework for lesson 5 - 3. OOP INTRODUCTION
 * 
 *         Create Console Application project in Java. Add class Employee to the
 *         project. Class Employee should consist of three private fields: name,
 *         rate and hours; static field totalSum properties for access to these
 *         fields; default constructor, constructor with 2 parameters (name and
 *         rate) and constructor with 3 parameters; methods: getSalary() - to
 *         calculate the salary of person (rate * hours) toString() - to output
 *         information about employee changeRate(int rate) - to change the rate
 *         of some employee and recalculate his salary getBonuses() Ц to
 *         calculate 10% from salary In the method main() create 3 objects of
 *         Employee type. Input information about them. Display the total salary
 *         of all workers to screen
 * 
 *
 * 
 */
public class Employee {

	private String name;
	private int rate;
	private int hours;
	private static int totalSum = 0;

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
		totalSum = totalSum - getSalary();
		this.rate = rate;
		totalSum = totalSum + getSalary();
	}

	public int getHours() {

		return hours;

	}

	public void setHours(int hours) {
		totalSum = totalSum + getSalary();
		this.hours = hours;
		totalSum = totalSum + getSalary();
	}

	public Employee() {
		name = "NoName";
		rate = 0;
		hours = 0;
		totalSum = totalSum + rate * hours;
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		hours = 0;
		totalSum = totalSum + rate * hours;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + getSalary();
	}

	@Override // чи це обов€зкове???
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	int getSalary() {
		return rate * hours;
	}

	double changeRate(int rate) {
		totalSum = totalSum - getSalary();
		this.rate = rate;
		totalSum = totalSum + getSalary();
		return rate * hours;
		

	}

	double getBonuses() {
		return 0.1 * rate * hours;

	}

	public static void main(String[] arg) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Ivan", 100);
		Employee emp3 = new Employee("Petro", 200, 8);

		System.out.println("Employee 1: " + emp1);
		System.out.println("Employee 2: " + emp2);
		System.out.println("Employee 3: " + emp3);
		System.out.println("TotalSum:" + totalSum); // порахувало загальну зарплатню
		System.out.println("-------------------------------------------");

		emp1.setName("Oleg");
		emp1.setRate(50);
		emp1.setHours(5);
		emp2.setHours(4);
		System.out.println("Employee 1: " + emp1);
		System.out.println("Employee 2: " + emp2);
		System.out.println("Employee 3: " + emp3);
		System.out.println("TotalSum:" + totalSum); // порахувало загальну зарплатню
		System.out.println("-------------------------------------------");

		System.out.println("Employees 1 salary:" + emp1.getSalary());
		System.out.println("Employees 2 salary:" + emp2.getSalary());
		System.out.println("Employees 3 salary:" + emp3.getSalary());
		System.out.println("TotalSum:" + totalSum); // порахувало загальну зарплатню
		emp3.changeRate(100);
		System.out.println("Employees 3 new rate:" + emp3.getRate() + " Employees 3 salary:" + emp3.getSalary());
		System.out.println("TotalSum:" + totalSum); // порахувало загальну зарплатню
		
		System.out.println("-------------------------------------------");
		System.out.println("Bonus for Employee 2:" + emp2.getBonuses() + " Total Employees 2 salary:"
				+ (emp2.getSalary() + emp2.getBonuses()));

	}

}
