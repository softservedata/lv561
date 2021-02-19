package com.softserve.edu.HW09.Employee;
/**
 * 	Create an interface to the method calculatePay(),
 *  the base class Employee with a string variable employeeld.
 *  Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
	Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
	Describe the string variable socialSecurityNumber in the class SalariedEmployee .
	Include a description of federalTaxIdmember in the class of ContractEmployee.
	
	The calculation formula for the "time-worker“ is:
	the average monthly salary = hourly rate * number of hours worked
	
	For employees with a fixed payment the formula is:
	the average monthly 	salary = fixed monthly payment
	
	Create an array of employees and add the employees with different form of payment.
	Arrange the entire sequence of workers descending the average monthly wage.
	Output the employee ID, name, and the average monthly wage for all elements of the list.


 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Default conctructor:\n\t "+emp);
		System.out.println("-------------------------------");
		Employee emp1 = new Employee ("0001", "Mike");
		System.out.println("Conctructor:\n\t"+emp1);
		System.out.println("-------------------------------");
		Employee semp = new SalariedEmployee();
		System.out.println("Default conctructor:\n\t "+semp);
		System.out.println("-------------------------------");
		Employee semp1 = new SalariedEmployee("0002","000005", "Joe", 42.25,3.5);
		System.out.println("Default conctructor:\n\t "+semp1);
		System.out.println("The average monthly salary = hourly rate * number of hours worked:\n\t "+semp1.calculatePay());
		System.out.println("-------------------------------");
		Employee cemp = new ContractEmployee();
		System.out.println("Default conctructor:\n\t "+cemp);
		System.out.println("-------------------------------");		
		Employee cemp1 = new ContractEmployee("0003","0000000005", "Joe", 1500);
		System.out.println("Default conctructor:\n\t "+cemp1);
		System.out.println("The average monthly salary = fixed monthly payment:\n\t "+cemp1.calculatePay());
		System.out.println("-------------------------------");
		Employee semp2 = new SalariedEmployee("0003","000006", "Mark", 50.25,16);
		Employee semp3 = new SalariedEmployee("0004","000007", "Jully", 48.25,22.5);
		Employee cemp2 = new ContractEmployee("0005","0000000009", "Jonh", 1250);
		Employee cemp3 = new ContractEmployee("0006","0000000015", "Bill", 1110);
		
		//Create an array of employees and add the employees with different form of payment.
		Employee [] arr = new Employee [6];
		arr[0] = semp1;
		arr[1] = cemp3;
		arr[2] = semp2;
		arr[3] = cemp2;
		arr[4] = semp3;
		arr[5] = cemp1;
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------");
		Employee tmp = arr[0];
		boolean isSorted = true;
		for(int i = 0;i<arr.length-1;i++) {
			
				// System.out.print(".-\n");
				isSorted = true;
				for (int j = 0; j < arr.length - 1 - i; j++) {
					// System.out.print(".");
					if (arr[j].calculatePay() < arr[j + 1].calculatePay()) {
						tmp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = tmp;
						isSorted = false;
					}

				}

				if (isSorted == true) {
					break;
				}

		}
		
			
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] +" "+arr[i].calculatePay());
		}
		
		
		
		
	}

}
