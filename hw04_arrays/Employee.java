package hw04_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Practice Task 2. 
 * Create a class Employee with fields name, department number, salary.
 * Create five instances of the class. 
 * Display: 
 * 	- all employees of a certain department (enter department number on the console)
 * 	- arrange workers by the field salary in descending order
 */

public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;

	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	void getEmployeeByNumber(ArrayList<Employee> empl) {
		System.out.print("Enter department number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();

		for (Employee e : empl) {
			if (e.getDepartmentNumber() == num) {
				System.out.println(e.toString());
			} 
		}

	}

	static Comparator<Employee> bySalary = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int salary1 = o1.getSalary();
			int salary2 = o2.getSalary();
			return salary2 - salary1;
		}
	};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jimmy Choo", 23, 5000),
				 e2 = new Employee("Katherine King", 45, 4950),
				 e3 = new Employee("Carlos Juanitos", 10, 4300), 
				 e4 = new Employee("Elisabeth Green", 79, 7800), 
				 e5 = new Employee("Margaret Gilbert", 23, 5100);
		
		ArrayList<Employee> empl = new ArrayList<>();
		empl.add(e1);
		empl.add(e2);
		empl.add(e3);
		empl.add(e4);
		empl.add(e5);

		System.out.println("Sorted in descending order: ");
		Collections.sort(empl, Employee.bySalary);
		for (Employee e : empl) {
			System.out.println(e);
		}
		
		e1.getEmployeeByNumber(empl);
		

	}

}
