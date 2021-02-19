package com.softserve.edu.HW09.Employee;

/*-
 * 
 * 	Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
	Describe fixed paid workers (second child). 	.
	Include a description of federalTaxIdmember in the class of ContractEmployee.
 * 
 * @author Taras Krasitskyi
 *
 */
public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	private double fixedPay;

	public ContractEmployee() {
		setEmployeeId("NoEmployeedId");
		this.federalTaxIdmember = "NoFederalTaxIdmember";
		setName("NoName");
		this.fixedPay = 0.0;
	}

	public ContractEmployee(String employeeId, String federalTaxIdmember, String name, double fixedPay) {
		setEmployeeId(employeeId);
		this.federalTaxIdmember = federalTaxIdmember;
		setName(name);
		this.fixedPay = fixedPay;

	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getFixedPay() {
		return fixedPay;
	}

	public void setFixedPay(double fixedPay) {
		this.fixedPay = fixedPay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeId= " + getEmployeeId() +", federalTaxIdmember=" + federalTaxIdmember +", name=" + getName() + ", fixedPay=" + fixedPay + "]";
				
	}
	
	@Override
	public double calculatePay() {
		return fixedPay;
	}
	

}
