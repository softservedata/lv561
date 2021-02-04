package com.softserve.edu.HW07;

import java.util.Arrays;
import java.util.Scanner;

/*-
Create a class Employee with fields
 name,
 department number,
 salary.
 Create five objects of class Employee.
 Display all employees of a certain department (enter department number in the console);
   arrange workers by the field salary in descending order.

 *
 */
public class Employee {
	private String name;
	private int dep_num;
	private double sallary;

	public Employee() {
		name = "NoName";
		dep_num = 0;
		sallary = 0;
	}

	public Employee(String name, int dep_num, double sallary) {
		this.name = name;
		this.dep_num = dep_num;
		this.sallary = sallary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDep_num() {
		return dep_num;
	}

	public void setDep_num(int dep_num) {
		this.dep_num = dep_num;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(float sallary) {
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", dep_num=" + dep_num + ", sallary=" + sallary + '}';
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Maike", 1, (350.5));
		Employee emp2 = new Employee("Jonh", 2, (450.75));
		Employee emp3 = new Employee("Sarah", 1, (295.23));
		Employee emp4 = new Employee("Lily", 2, (250.05));
		Employee emp5 = new Employee("Lil", 3, (280.15));
		System.out.println("\t"+emp1);
		System.out.println("\t"+emp2);
		System.out.println("\t"+emp3);
		System.out.println("\t"+emp4);
		System.out.println("\t"+emp5);
		Employee[] a = new Employee[5];
		a[0] = emp1;
		a[1] = emp2;
		a[2] = emp3;
		a[3] = emp4;
		a[4] = emp5;
		//
		System.out.print("Input departament number: ");
		Scanner sc = new Scanner(System.in);
		boolean chk = false;
		int dn = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < a.length; i++) {
			if (a[i].getDep_num() == dn) {
				if (chk == false) {
					System.out.println("In departament num." + dn + " works: ");
					chk = true;
				}
				System.out.println("\t"+a[i]);
			}
		}
		if (chk == false) {
			System.out.println("No such departament num!!!");
		}
		sc.close();
		//
		boolean isSorted = true;
		Employee tmp = new Employee();
		for (int i = 0; i < a.length - 1; i++) {
			// System.out.print(".-\n");
			isSorted = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				// System.out.print(".");
				if (a[j].getSallary() > a[j + 1].getSallary()) {
					tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
					isSorted = false;
				}

			}

			if (isSorted == true) {
				break;
			}

		}
		System.out.println("Sorting by sallary: ");
		for (int i = 0; i < a.length; i++)
			System.out.println("\t"+a[i]);

		// System.out.println('\n'+Arrays.toString(a));

	}
}
