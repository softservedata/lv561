package com.softserve.edu.HW09.Employee;
/*-
 * 
 * 	Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
	Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
 * 
 * @author Taras Krasitskyi
 *
 */

public class SalariedEmployee extends Employee  {

	private String socialSecurityNumber;
	private double hourlyPay;
	private double hoursWorked;

	public SalariedEmployee() {

		socialSecurityNumber = "NoSocialSecurityNumber";
		setEmployeeId("NoEmployeedId");
		setName("NoName");
		hourlyPay = 0.0;
		hoursWorked = 0.0;

	}

	public SalariedEmployee(String employeeId, String socialSecurityNumber, String name, double hourlyPay, double hoursWorked) {
		setEmployeeId(employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		setName(name);
		this.hourlyPay = hourlyPay;
		this.hoursWorked = hoursWorked;

	}
	
	

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [employeeId=" + getEmployeeId() + ", socialSecurityNumber=" + socialSecurityNumber
				+ ", name=" + getName() + ", hourlyPay=" + hourlyPay +", hoursWorked= "+hoursWorked+ "]";
	}
	@Override
	public double calculatePay() {
		
		return hourlyPay*hoursWorked;
	}

}
