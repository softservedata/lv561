package com.softserve.edu.HW09.Employee;
/*-
 * 
 * 
 * The base class Employee with a string variable employeeld
 * 
 * 
 * 
 * @author Taras Krasirskyi
 *
 */

public class Employee implements calcPay{
	private String employeeId;
	private String name;

	public Employee() {
		employeeId = "NoEmployeeId";
		name = "NoName";
	}

	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emloyee [employeeId=" + employeeId + ", name=" + name + "]";
	}
	
	@Override
	public double calculatePay() {
		return 0;
	}

}
